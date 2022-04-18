package jp.soramame.sugarlands.advancements;

import java.util.List;
import java.util.function.Consumer;

import com.google.common.collect.ImmutableList;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBiomes;
import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.advancements.criterion.LocationPredicate;
import net.minecraft.advancements.criterion.PositionTrigger;
import net.minecraft.item.Items;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.biome.Biome;

public class SugarAdvancements implements Consumer<Consumer<Advancement>> {

	//.addCriterion("install_sugards", ChangeDimensionTrigger.Instance.changedDimensionTo(World.OVERWORLD))
	//display(icon,title,description,background,frame,show_toast,announce_to_chat,hidden)
	//アイコン、タイトル、説明、背景、フレーム、画面横から出てくるか(トースター通知というらしい)、チャットに表示するか、隠すか

	String modid = SugarLandsCore.MOD_ID;
	String title = ".sugar.";
	String title2 = "sugar/";

	private static final List<RegistryKey<Biome>> EXPLORABLE_BIOMES = ImmutableList.of(SLBiomes.SUGAR_DESERT,SLBiomes.SUGAR_FOREST,SLBiomes.PUDDING_PLAIN,SLBiomes.ICECANDY_SPIKES);

	@Override
	public void accept(Consumer<Advancement> t) {
		Advancement advancementloot = Advancement.Builder.advancement()
				.display(SLBlocks.SUGAR_BLOCK.get(),trance("root", 0),trance("root", 1),
						new ResourceLocation(modid, "textures/block/sugar_block.png"),
						FrameType.TASK,false,false,false)
				.addCriterion("entered_world", InventoryChangeTrigger.Instance.hasItems(Items.AIR)).save(t, m("root"));
		Advancement sugar = Advancement.Builder.advancement()
				.display(Items.SUGAR,trance("sugar", 0),trance("sugar", 1),null, FrameType.TASK, true, true, false)
				.addCriterion("get_sugar", InventoryChangeTrigger.Instance.hasItems(Items.SUGAR)).parent(advancementloot).save(t, m("sugar"));
		Advancement.Builder.advancement()
			.display(SLBlocks.SUGAR_BLOCK.get(),trance("sugar_block", 0),trance("sugar_block", 1),null, FrameType.TASK, true, true, false)
			.addCriterion("get_sugar_block", InventoryChangeTrigger.Instance.hasItems(SLBlocks.SUGAR_BLOCK.get()))
			.parent(sugar).save(t, m("sugar_block"));
		Advancement visit = Advancement.Builder.advancement()
			.display(SLBlocks.SUGAR_STONE.get(), trance("sugar_desert", 0), trance("sugar_desert", 1), null, FrameType.TASK, true, true, false)
			.addCriterion("visit_sugar_desert", PositionTrigger.Instance.located(LocationPredicate.inBiome(SLBiomes.SUGAR_DESERT)))
			.parent(advancementloot).save(t, m("visit_sugar_desert"));
		addbiomes(Advancement.Builder.advancement(), EXPLORABLE_BIOMES)
			.display(SLBlocks.SUGAR_DIAMOND_BLOCK.get(), trance("sweet_adventure", 0), trance("sweet_adventure", 1), null, FrameType.CHALLENGE, true, true, false)
			.rewards(AdvancementRewards.Builder.experience(500)).parent(visit).save(t, m("sweet_adventure"));
		Advancement.Builder.advancement().display(SLBlocks.ROTTEN_FLESH_BLOCK.get(), trance("rotten", 0), trance("rotten", 1), null, FrameType.TASK, true, true, false)
			.addCriterion("get_rotten_fresh", InventoryChangeTrigger.Instance.hasItems(SLBlocks.ROTTEN_FLESH_BLOCK.get())).parent(advancementloot).save(t, m("rotten"));
	}

	private String advance(String name,int sw) {
		if(sw==0) {
			return "advancements."+modid+title+name+".title";
		}else {
			return "advancements."+modid+title+name+".description";
		}
	}
	private String m(String s) {
		return modid+":"+title2+s;
	}
	private TranslationTextComponent trance(String name,int sw) {
		return new TranslationTextComponent(advance(name, sw));
	}
	private Advancement.Builder addbiomes(Advancement.Builder a,List<RegistryKey<Biome>> b){
		for(RegistryKey<Biome> biome:b) {
			a.addCriterion("visit_"+biome.location().toString().replace(":", "_"), PositionTrigger.Instance.located(LocationPredicate.inBiome(biome)));
		}
		return a;
	}
}
