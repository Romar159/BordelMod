package com.mod.snd.blocks;

import java.util.Random;

import com.mod.snd.init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GigaSatanas_ore extends Block {

	public GigaSatanas_ore(Material p_i45394_1_, int level) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 4);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return ItemMod.giga_satanas;
    }

}
