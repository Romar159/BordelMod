package com.mod.snd.world;

import java.util.Random;

import com.mod.snd.init.BlockMod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenBordelMod implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
			
		case -1:
			GenerateNether(world, chunkX * 16, chunkZ * 16, random);
			break;
		case 0:
			GenerateOverworld(world, chunkX * 16, chunkZ * 16, random);
			break;
		case 1:
			GenerateEnd(world, chunkX * 16, chunkZ * 16, random);
			break;
			
		}
	}
	
	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int spawnChance) {
		for(int i=0; i < spawnChance; i++) {
			int chunkSize = 16;
			int Xpos = posX + random.nextInt(chunkSize);
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = posX + random.nextInt(chunkSize);
			
			new WorldGenMinable(block, maxV, blockSpawn).generate(world, random, Xpos, Ypos, Zpos);
			
		}
	}
	
	private void GenerateNether(World world, int i, int j, Random random) {		
	
	}
	
	private void GenerateOverworld(World world, int i, int j, Random random) {		
		addOre(BlockMod.bordel_block, Blocks.stone, random, world, i, j, 5, 35, 8, 15, 9);
	}

	private void GenerateEnd(World world, int i, int j, Random random) {		
	
	}

	
}
