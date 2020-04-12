package com.mod.snd.handlers;

import java.util.Random;

import com.mod.snd.BordelMod;
import com.mod.snd.Reference;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityHandler {
	public static void registerMonster(Class entityClass, String string) {
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long x = string.hashCode();
		Random random = new Random(x);
		int mainColor = random.nextInt() * 666;
		int subColor = random.nextInt() * 1705;
		
		EntityRegistry.registerGlobalEntityID(entityClass, string, entityID);
		EntityRegistry.addSpawn(string, 4, 1, 1, EnumCreatureType.monster, BiomeGenBase.plains);
		EntityRegistry.registerModEntity(entityClass, string, entityID, BordelMod.instance, 30, 1, true);
		
	}
}
