package jp.soramame.sugarlands.provider;

import java.util.Objects;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBlockItems;
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
		paneBlockItem(SLBlockItems.Sugar_Candy_Pane.get(),"sugar_candy");
		simpleItem(SLBlockItems.Sugar_Door.get());
	}

	private void simpleItem(Item item) {
		ResourceLocation name = Objects.requireNonNull(item.getRegistryName());
		singleTexture(name.getPath(), mcLoc(folder + "/generated"), "layer0", new ResourceLocation(name.getNamespace(), folder + "/" + name.getPath()));
	}
	/**めんどいからやらんけどこのコメントを見た君は
	 * "sugards:block/"+name.getPath()じゃなくて
	 * MOD_ID+":block/"+name.getPath()とかにするんだぞmodidを変えたときにここも変えないといけなくなるぞ！！*/
	public void blockItem(Item item) {
		ResourceLocation name = Objects.requireNonNull(item.getRegistryName());
		withExistingParent(name.getPath(),"sugards:block/"+name.getPath());
	}
	public void fenceblockItem(Item item) {
		ResourceLocation name = Objects.requireNonNull(item.getRegistryName());
		withExistingParent(name.getPath(),SugarLandsCore.MOD_ID+":block/"+name.getPath()+"_inventory");
	}
	public void paneBlockItem(Item item,String base) {
		ResourceLocation name = Objects.requireNonNull(item.getRegistryName());
		singleTexture(name.getPath(), mcLoc(folder + "/generated"), "layer0", new ResourceLocation(name.getNamespace(), "block/" + base));
	}
}
