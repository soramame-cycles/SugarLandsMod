package jp.soramame.sugarlands.world.gen.surfacebuilders;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.ValleySurfaceBuilder;

public class RottenWasteSurfaceBuilder extends ValleySurfaceBuilder {

	private static final BlockState RAW_SUGAR_BLOCK = SLBlocks.RAW_SUGAR_BLOCK.get().defaultBlockState();
	private static final BlockState NETHERRACK = Blocks.NETHERRACK.defaultBlockState();
	private static final BlockState ROTTEN_FLESH_BLOCK = SLBlocks.ROTTEN_FLESH_BLOCK.get().defaultBlockState();

	private static final ImmutableList<BlockState> FLOOR_BLOCK_STATES = ImmutableList.of(ROTTEN_FLESH_BLOCK,NETHERRACK);
	private static final ImmutableList<BlockState> CEILING_BLOCK_STATES = ImmutableList.of(ROTTEN_FLESH_BLOCK);

	public RottenWasteSurfaceBuilder(Codec<SurfaceBuilderConfig> p_i232130_1_) {
		super(p_i232130_1_);
	}

	@Override
	protected ImmutableList<BlockState> getFloorBlockStates() {
		return FLOOR_BLOCK_STATES;
	}

	@Override
	protected ImmutableList<BlockState> getCeilingBlockStates() {
		return CEILING_BLOCK_STATES;
	}

	@Override
	protected BlockState getPatchBlockState() {
		return RAW_SUGAR_BLOCK;
	}

}
