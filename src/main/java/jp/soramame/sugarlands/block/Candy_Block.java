package jp.soramame.sugarlands.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Candy_Block extends Block {

	public Candy_Block(Properties p_i48440_1_) {
		super(p_i48440_1_);
	}

	@SuppressWarnings("deprecation")
	@OnlyIn(Dist.CLIENT)
	   public boolean skipRendering(BlockState p_200122_1_, BlockState p_200122_2_, Direction p_200122_3_) {
	      return p_200122_2_.is(this) ? true : super.skipRendering(p_200122_1_, p_200122_2_, p_200122_3_);
	   }

}
