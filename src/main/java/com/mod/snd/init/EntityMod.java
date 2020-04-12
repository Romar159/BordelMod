package com.mod.snd.init;

import com.mod.snd.entity.EntityBordelMod;
import com.mod.snd.handlers.EntityHandler;

public class EntityMod {
	public static void init() {
		EntityHandler.registerMonster(EntityBordelMod.class, "ChveuxVerts");
	}
}
