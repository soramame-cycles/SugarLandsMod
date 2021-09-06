package jp.soramame.sugarlands.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockPos.Mutable;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class Raw_Sugar_Block extends FallingBlock {
	private final BlockState wet;

	public Raw_Sugar_Block(Block block,Properties p_i48401_1_) {
		super(p_i48401_1_);
		this.wet = block.defaultBlockState();
	}
	public void onLand(World world, BlockPos pos, BlockState p_176502_3_, BlockState state, FallingBlockEntity fallbe) {
		if(shouldSolidify(world,pos,state)) {
			world.setBlock(pos, this.wet, 3);
		}
	}
	public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
		IBlockReader lvt_2_1_ = p_196258_1_.getLevel();
		BlockPos lvt_3_1_ = p_196258_1_.getClickedPos();
		BlockState lvt_4_1_ = lvt_2_1_.getBlockState(lvt_3_1_);
		return shouldSolidify(lvt_2_1_, lvt_3_1_, lvt_4_1_) ? this.wet : super.getStateForPlacement(p_196258_1_);
	}
	public BlockState updateShape(BlockState p_196271_1_, Direction direction, BlockState state, IWorld world, BlockPos pos1, BlockPos pos2) {
		return touchesLiquid(world, pos1) ? this.wet : super.updateShape(p_196271_1_, direction, state, world, pos1, pos2);
	}
	private boolean shouldSolidify(IBlockReader blockreader, BlockPos pos, BlockState state) {
		return canSolidify(state) || touchesLiquid(blockreader, pos);
	}
	private boolean canSolidify(BlockState state) {
		return state.getFluidState().is(FluidTags.LAVA);
	}
	private boolean touchesLiquid(IBlockReader blockreader, BlockPos pos) {
		boolean flag = false;
		Mutable mutable = pos.mutable();
		Direction[] direction = Direction.values();
		int var5 = direction.length;
		for(int var6 = 0; var6 < var5; ++var6) {
			Direction direction2 = direction[var6];
			BlockState state = blockreader.getBlockState(mutable);
			if (direction2 != Direction.DOWN || canSolidify(state)) {
				mutable.setWithOffset(pos, direction2);
				state = blockreader.getBlockState(mutable);
				if (canSolidify(state) && !state.isFaceSturdy(blockreader, pos, direction2.getOpposite())) {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

}
