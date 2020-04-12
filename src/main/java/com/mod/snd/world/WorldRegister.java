package com.mod.snd.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister {
	
	public static void mainRegistry() {
		registerWorldGen(new WorldGenBordelMod(), -1);
		registerWorldGen(new WorldGenBordelMod(), 0);
		registerWorldGen(new WorldGenBordelMod(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator iGenerator, int probability) {
		GameRegistry.registerWorldGenerator(iGenerator, probability);
	}
}
