package jp.soramame.sugarlands.block;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class SLLogs extends RotatedPillarBlock {

    public SLLogs(MaterialColor top,MaterialColor side) {
        super(Properties.of(Material.WOOD, XZorY -> XZorY.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? top : side)
                .strength(2.0F).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE));
    }

    @Override
    public BlockState getToolModifiedState(BlockState state, World world, BlockPos pos, PlayerEntity player,
            ItemStack stack, ToolType toolType) {
        Block block = state.getBlock();
        if(block==SLBlocks.SUGAR_LOG.get()) {
            return SLBlocks.STRIPPED_SUGAR_LOG.get().defaultBlockState();
        }else if(block==SLBlocks.SUGAR_WOOD.get()){
            return SLBlocks.STRIPPED_SUGAR_WOOD.get().defaultBlockState();
        }else {
            return super.getToolModifiedState(state, world, pos, player, stack, toolType);
        }
    }
}
