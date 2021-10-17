package jp.soramame.sugarlands.block;

import java.util.Random;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class Sugar_Ore_Block extends OreBlock {

	public Sugar_Ore_Block(Properties p_i48357_1_) {
		super(p_i48357_1_);
	}

	protected int xpOnDrop(Random p_220281_1_) {
		if (this == SLBlocks.SUGAR_DIAMOND_ORE.get()) {
			return MathHelper.nextInt(p_220281_1_, 3, 7);
		}
		else if(this == SLBlocks.SUGARRACK.get()) {
			return MathHelper.nextInt(p_220281_1_, 3, 7);
		}
		else if(this == SLBlocks.END_SUGAR_STONE.get()) {
			return MathHelper.nextInt(p_220281_1_, 3, 7);
		}
		return 0;

	}

	@Override
	public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
		return silktouch == 0 ? this.xpOnDrop(RANDOM) : 0;
	}

}
