package jp.soramame.sugarlands.world.gen.surfacebuilders;

import java.util.Random;

import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class SugarSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {

	public SugarSurfaceBuilder(Codec<SurfaceBuilderConfig> p_i232136_1_) {
		super(p_i232136_1_);
	}

	//DefaltSurfaceBuilderをコピペと難読化をできる限り解読
	public void apply(Random rand, IChunk chunk, Biome biome, int x, int z, int y, double chance,
			BlockState p_205610_9_, BlockState p_205610_10_, int p_205610_11_, long seed,
			SurfaceBuilderConfig config) {
		SurfaceBuilder.DEFAULT.apply(rand, chunk, biome, x, z, y, chance, p_205610_9_, p_205610_10_, p_205610_11_,
				seed, config);
		this.apply(rand, chunk, biome, x, z, y, chance, p_205610_9_, p_205610_10_, config.getTopMaterial(),
				config.getUnderMaterial(), config.getUnderwaterMaterial(), p_205610_11_);
	}

	@SuppressWarnings("deprecation")
	public void apply(Random rand, IChunk chunk, Biome biome, int x, int z, int y, double chance,
			BlockState p_206967_9_, BlockState p_206967_10_, BlockState getTopMaterial, BlockState getUnderMaterial,
			BlockState getUnderwaterMaterial, int p_206967_14_) {

		BlockState blockstate = getTopMaterial;
		BlockState blockstate1 = getUnderMaterial;
		BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();
		int i = -1;
		int j = (int) (chance / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
		int k = x & 15;
		int l = z & 15;

		for (int i1 = y; i1 >= 0; --i1) {
			blockpos$mutable.set(k, i1, l);
			BlockState blockstate2 = chunk.getBlockState(blockpos$mutable);
			if (blockstate2.isAir()) {
				i = -1;
			} else if (blockstate2.is(p_206967_9_.getBlock())) {
				if (i == -1) {
					if (j <= 0) {
						blockstate = Blocks.AIR.defaultBlockState();
						blockstate1 = p_206967_9_;
					} else if (i1 >= p_206967_14_ - 4 && i1 <= p_206967_14_ + 1) {
						blockstate = getTopMaterial;
						blockstate1 = getUnderMaterial;
					}

					if (i1 < p_206967_14_ && (blockstate == null || blockstate.isAir())) {
						if (biome.getTemperature(blockpos$mutable.set(x, i1, z)) < 0.15F) {
							blockstate = Blocks.ICE.defaultBlockState();
						} else {
							blockstate = p_206967_10_;
						}

						blockpos$mutable.set(k, i1, l);
					}

					i = j;
					if (i1 >= p_206967_14_ - 1) {
						chunk.setBlockState(blockpos$mutable, blockstate, false);
					} else if (i1 < p_206967_14_ - 7 - j) {
						blockstate = Blocks.AIR.defaultBlockState();
						blockstate1 = p_206967_9_;
						chunk.setBlockState(blockpos$mutable, getUnderwaterMaterial, false);
					} else {
						chunk.setBlockState(blockpos$mutable, blockstate1, false);
					}
				} else if (i > 0) {
					--i;
					chunk.setBlockState(blockpos$mutable, blockstate1, false);
					if (i == 0 && blockstate1.is(SLBlocks.SUGAR_BLOCK.get()) && j > 1) {
						i = rand.nextInt(4) + Math.max(0, i1 - 63);
						blockstate1 = blockstate1.is(SLBlocks.SUGAR_BLOCK.get()) ? SLBlocks.SUGAR_STONE.get().defaultBlockState()
								: SLBlocks.PUDDING_BLOCK.get().defaultBlockState();
					}else if(i == 0 && blockstate1.is(SLBlocks.CALAMEL_SAUCE.get()) && j > 1) {
						i = rand.nextInt(4) + Math.max(0, i1 - 63);
						blockstate1 = SLBlocks.PUDDING_BLOCK.get().defaultBlockState();
					}
				}
			}
		}
	}

}
