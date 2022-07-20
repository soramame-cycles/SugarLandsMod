package jp.soramame.sugarlands.block;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;

public class Raw_Sugar_Block extends FallingBlock {

    public Raw_Sugar_Block(Properties p_i48401_1_) {
        super(p_i48401_1_);
    }
    public void onLand(Level world, BlockPos pos, BlockState p_176502_3_, BlockState state, FallingBlockEntity fallbe) {
        if(shouldSolidify(world,pos,state)) {
            world.setBlock(pos, hot(), 3);
        }
    }
    public BlockState getStateForPlacement(BlockPlaceContext p_196258_1_) {
        BlockGetter lvt_2_1_ = p_196258_1_.getLevel();
        BlockPos lvt_3_1_ = p_196258_1_.getClickedPos();
        BlockState lvt_4_1_ = lvt_2_1_.getBlockState(lvt_3_1_);
        return shouldSolidify(lvt_2_1_, lvt_3_1_, lvt_4_1_) ? hot() : super.getStateForPlacement(p_196258_1_);
    }
    public BlockState updateShape(BlockState p_196271_1_, Direction direction, BlockState state, LevelAccessor world, BlockPos pos1, BlockPos pos2) {
        return touchesLiquid(world, pos1) ? hot() : super.updateShape(p_196271_1_, direction, state, world, pos1, pos2);
    }

    private boolean shouldSolidify(BlockGetter getter, BlockPos pos, BlockState state) {
        return canSolidify(state) || touchesLiquid(getter, pos);
    }
    private boolean canSolidify(BlockState state) {
        return state.getFluidState().is(FluidTags.LAVA);
    }
    private boolean touchesLiquid(BlockGetter blockreader, BlockPos pos) {
        boolean flag = false;
        MutableBlockPos mutable = pos.mutable();
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
    private BlockState hot() {
        return SLBlocks.LIT_RAW_SUGAR_BLOCK.get().defaultBlockState();
    }
}
