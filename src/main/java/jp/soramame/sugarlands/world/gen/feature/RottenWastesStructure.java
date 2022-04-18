package jp.soramame.sugarlands.world.gen.feature;

import java.util.Random;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BasaltDeltasFeature;
import net.minecraft.world.gen.feature.Feature;

public class RottenWastesStructure extends Feature<BasaltDeltasFeature> {

	private static final ImmutableList<Block> CANNOT_REPLACE = ImmutableList.of(Blocks.BEDROCK, Blocks.NETHER_BRICKS, Blocks.NETHER_BRICK_FENCE, Blocks.NETHER_BRICK_STAIRS, Blocks.NETHER_WART, Blocks.CHEST, Blocks.SPAWNER);

	public RottenWastesStructure(Codec<BasaltDeltasFeature> p_i231953_1_) {
		super(p_i231953_1_);
	}

	@Override
	public boolean place(ISeedReader isee, ChunkGenerator gen, Random rand, BlockPos pos,
			BasaltDeltasFeature bdf) {
		boolean flag = false;
		boolean flag1 = rand.nextDouble() < 0.9D;
		int i = flag1 ? bdf.rimSize().sample(rand) : 0;
		int j = flag1 ? bdf.rimSize().sample(rand) : 0;
		boolean flag2 = flag1 && i != 0 && j != 0;
		int k = bdf.size().sample(rand);
		int l = bdf.size().sample(rand);
		int i1 = Math.max(k, l);

		for(BlockPos blockpos : BlockPos.withinManhattan(pos, k, 0, l)) {
			if (blockpos.distManhattan(pos) > i1) {
				break;
			}

			if (isClear(isee, blockpos, bdf)) {
				if (flag2) {
				flag = true;
				this.setBlock(isee, blockpos, bdf.rim());
				}

				BlockPos blockpos1 = blockpos.offset(i, 0, j);
				if (isClear(isee, blockpos1, bdf)) {
				flag = true;
				this.setBlock(isee, blockpos1, bdf.contents());
				}
			}
		}
		return flag;
	}

	private static boolean isClear(IWorld world, BlockPos pos, BasaltDeltasFeature bdf) {
		BlockState blockstate = world.getBlockState(pos);
		if (blockstate.is(bdf.contents().getBlock())) {
			return false;
		} else if (CANNOT_REPLACE.contains(blockstate.getBlock())) {
			return false;
		} else {
			return true;
		}
	}

}
