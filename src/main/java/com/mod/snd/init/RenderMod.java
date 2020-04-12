package com.mod.snd.init;

import com.mod.snd.entity.EntityBordelMod;
import com.mod.snd.models.ModelBordelMod;
import com.mod.snd.renders.RenderBordelMod;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderMod {
	
	public static void init()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityBordelMod.class, new RenderBordelMod(new ModelBordelMod(), 0.5F));
    }

}
