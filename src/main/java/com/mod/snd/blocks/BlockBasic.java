package com.mod.snd.blocks;

import java.util.Random;

import com.mod.snd.init.ItemMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockBasic extends Block {

	public BlockBasic(Material p_i45394_1_, int level) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", level);
	}
}
