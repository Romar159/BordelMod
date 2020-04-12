package com.mod.snd.renders;

import com.mod.snd.Reference;
import com.mod.snd.entity.EntityBordelMod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderBordelMod extends RenderLiving {

	private ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":textures/mobs/ChveuVert.png");
	
	public RenderBordelMod(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
	}

	protected ResourceLocation getEntiyTexture(EntityLiving living)
    {
        return this.getEntityTexture((EntityBordelMod) living);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return texture;
    }   
   

}
