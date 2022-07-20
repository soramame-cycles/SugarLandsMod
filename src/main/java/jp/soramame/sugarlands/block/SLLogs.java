package jp.soramame.sugarlands.block;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolAction;


public class SLLogs extends RotatedPillarBlock {

    public SLLogs(MaterialColor top,MaterialColor side) {
        super(Properties.of(Material.WOOD, XZorY -> XZorY.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? top : side)
                .strength(2.0F).sound(SoundType.WOOD));
    }

    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        Block block = state.getBlock();
        if(block==SLBlocks.SUGAR_LOG.get()) {
            return SLBlocks.STRIPPED_SUGAR_LOG.get().defaultBlockState();
        }else if(block==SLBlocks.SUGAR_WOOD.get()){
            return SLBlocks.STRIPPED_SUGAR_WOOD.get().defaultBlockState();
        }else {
            return super.getToolModifiedState(state,context, toolAction, simulate);
        }
    }

}
