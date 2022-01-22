package jp.soramame.sugarlands.provider;

import java.util.Objects;

import jp.soramame.sugarlands.init.SLItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLItemModelProvider extends ItemModelProvider {

	public SLItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
		super(generator, modid, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		simpleItem(SLItems.Sugar_Diamond.get());
		simpleItem(SLItems.Sugar_Diamond_nugget.get());
		simpleItem(SLItems.Bismuth_Crystal.get());
		simpleItem(SLItems.Azuki_Been.get());
		simpleItem(SLItems.Azuki_Paste.get());
		simpleItem(SLItems.Azuki_Paste_Bun.get());
		toolItem(SLItems.Bismuth_Pickaxe.get());
		toolItem(SLItems.Sugar_Diamond_Pickaxe.get());
		simpleItem(SLItems.Crushed_Sugar_Cane.get());
		simpleItem(SLItems.Poppy_Seed.get());
		simpleItem(SLItems.Pudding.get());
		simpleItem(SLItems.Raw_sugar.get());
	}

	public void simpleItem(Item item) {
		ResourceLocation name = Objects.requireNonNull(item.getRegistryName());
		singleTexture(name.getPath(), mcLoc(folder + "/generated"), "layer0", new ResourceLocation(name.getNamespace(), folder + "/" + name.getPath()));
	}
	public void toolItem(Item item) {
		ResourceLocation name = Objects.requireNonNull(item.getRegistryName());
		singleTexture(name.getPath(),mcLoc(folder + "/handheld"),"layer0",new ResourceLocation(name.getNamespace(), folder + "/" + name.getPath()));
	}
	/**めんどいからやらんけどこのコメントを見た君は
	 * "sugards:block/"+name.getPath()じゃなくて
	 * MOD_ID+":block/"+name.getPath()とかにするんだぞmodidを変えたときにここも変えないといけなくなるぞ！！
	 * name.getNamespace()じゃね？*/
	public void blockItem(Item item) {
		ResourceLocation name = Objects.requireNonNull(item.getRegistryName());
		withExistingParent(name.getPath(),name.getNamespace() + ":block/" + name.getPath());
	}
}
