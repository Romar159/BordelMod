package com.mod.snd.blocks.machines;

import java.util.List;

import com.mod.snd.Reference;
import com.mod.snd.init.BlockMod;
import com.mod.snd.init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class OreTesseract extends Block {
	
	
	public static String[] subBlock = new String[] {"tesseract_void", "tesseract_coal", "tesseract_iron", "tesseract_redstone", "tesseract_lapis", "tesseract_gold", "tesseract_diamond", "tesseract_emerald", "tesseract_bordel_ingot", "giga_satanas_ingot"};
	public IIcon[] iconArray = new IIcon[subBlock.length];
	
	public OreTesseract(Material material, int level, String toolType) {
		super(material);
		this.setHarvestLevel(toolType, level);
	}
	
	public int damageDropped(int metadata) {
		return metadata;
	}

	public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
		for(int i = 0; i < subBlock.length; i++)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}

	public void registerBlockIcons(IIconRegister iconRegister) {
		for(int i = 0; i < subBlock.length; i++)
		{
			this.iconArray[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" + subBlock[i]);
		}
	}

	public IIcon getIcon(int side, int metadata) {
		return metadata >= 0 && metadata < subBlock.length ? this.iconArray[metadata] : this.iconArray[0];
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if (player.isSneaking() == true) {
			System.out.println("Il est en sneak");
			if (player.getCurrentEquippedItem() != null) { // BUG ICI !
				//System.out.println("A bien quelque chose dans la main et est en sneak");
				if (player.getCurrentEquippedItem().getItem() == Items.coal) {
					world.setBlock(x, y, z, BlockMod.ore_tesseract, 1, 2); // change pour le bloc metadata coal (1)
					player.inventory.consumeInventoryItem(Items.coal);
				} else if (player.getCurrentEquippedItem().getItem() == Items.iron_ingot) {
					world.setBlock(x, y, z, BlockMod.ore_tesseract, 2, 2); // change pour le bloc metadata iron (2) (le premier 2)
					player.inventory.consumeInventoryItem(Items.iron_ingot);
				} else if (player.getCurrentEquippedItem().getItem() == Items.redstone) {
					world.setBlock(x, y, z, BlockMod.ore_tesseract, 3, 2); 
					player.inventory.consumeInventoryItem(Items.redstone);
				} else if (player.getCurrentEquippedItem().getUnlocalizedName() == "lapis_lazuli" /* LAPIS */) { // lapis
					world.setBlock(x, y, z, BlockMod.ore_tesseract, 4, 2);
					player.inventory.consumeInventoryItem(Items.dye /* LAPIS */);
				} else if (player.getCurrentEquippedItem().getItem() == Items.gold_ingot) {
					world.setBlock(x, y, z, BlockMod.ore_tesseract, 5, 2); 
					player.inventory.consumeInventoryItem(Items.gold_ingot);
				} else if (player.getCurrentEquippedItem().getItem() == Items.diamond) {
					world.setBlock(x, y, z, BlockMod.ore_tesseract, 6, 2); 
					player.inventory.consumeInventoryItem(Items.diamond);
				} else if (player.getCurrentEquippedItem().getItem() == Items.emerald) {
					world.setBlock(x, y, z, BlockMod.ore_tesseract, 7, 2);
					player.inventory.consumeInventoryItem(Items.emerald);
				} else if (player.getCurrentEquippedItem().getItem() == ItemMod.bordel_ingot) {
					world.setBlock(x, y, z, BlockMod.ore_tesseract, 8, 2);
					player.inventory.consumeInventoryItem(ItemMod.bordel_ingot);
				} else if (player.getCurrentEquippedItem().getItem() == ItemMod.giga_satanas_ingot) {
					world.setBlock(x, y, z, BlockMod.ore_tesseract, 9, 2); 
					player.inventory.consumeInventoryItem(ItemMod.giga_satanas_ingot);
				}
			}
		}
		
		if (player.isSneaking() == false) {
			System.out.println("Il est pas en sneak");

			if(world.getBlockMetadata(x, y, z) == 1) { // si le bloc à du coal
				player.inventory.addItemStackToInventory(new ItemStack(Items.coal, 1));
			}
			if(world.getBlockMetadata(x, y, z) == 2) { 
				player.inventory.addItemStackToInventory(new ItemStack(Items.iron_ingot, 1));
			}
			if(world.getBlockMetadata(x, y, z) == 3) { 
				player.inventory.addItemStackToInventory(new ItemStack(Items.redstone, 1));
			}
			if(world.getBlockMetadata(x, y, z) == 4) { 
				player.inventory.addItemStackToInventory(new ItemStack(Items.dye, 1)); // lapis
			}
			if(world.getBlockMetadata(x, y, z) == 5) {
				player.inventory.addItemStackToInventory(new ItemStack(Items.gold_ingot, 1));
			}
			if(world.getBlockMetadata(x, y, z) == 6) { 
				player.inventory.addItemStackToInventory(new ItemStack(Items.diamond, 1));
			}
			if(world.getBlockMetadata(x, y, z) == 7) { 
				player.inventory.addItemStackToInventory(new ItemStack(Items.emerald, 1));
			}
			if(world.getBlockMetadata(x, y, z) == 8) {
				player.inventory.addItemStackToInventory(new ItemStack(ItemMod.bordel_ingot, 1));
			}
			if(world.getBlockMetadata(x, y, z) == 9) {
				player.inventory.addItemStackToInventory(new ItemStack(ItemMod.giga_satanas_ingot, 1));
			}
			
			
		}
		return false;
		
	}
}
