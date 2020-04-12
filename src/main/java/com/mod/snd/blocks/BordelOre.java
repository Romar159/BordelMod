package com.mod.snd.blocks;

import java.util.Random;

import com.mod.snd.init.ItemMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BordelOre extends Block{

	public BordelOre(Material p_i45394_1_, int level) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", level);
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public float getAmbientOcclusionLightValue() {
		return 1.0F;
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ItemMod.bordel_fragment;
    }

}
