package com.mod.snd.proxy;

import com.mod.snd.entity.EntityBordelMod;
import com.mod.snd.init.RenderMod;
import com.mod.snd.models.ModelBordelMod;
import com.mod.snd.renders.RenderBordelMod;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		
		RenderMod.init();
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBordelMod.class, new RenderBordelMod(new ModelBordelMod(), 0.5f));
	}
	
}
