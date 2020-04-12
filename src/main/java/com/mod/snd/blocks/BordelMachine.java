package com.mod.snd.blocks;

import com.mod.snd.Reference;
import com.mod.snd.init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BordelMachine extends Block {
	
	private IIcon top, bottom, left, right, back, front;

	public BordelMachine(Material p_i45394_1_, int level) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", level);
	}
	
	public void registerBlockIcons(IIconRegister iiconRegister)
    {
        this.blockIcon = iiconRegister.registerIcon(Reference.MOD_ID + ":bordel_machine");
        this.top = iiconRegister.registerIcon(Reference.MOD_ID + ":bordel_machine_top");
        this.bottom = iiconRegister.registerIcon(Reference.MOD_ID + ":bordel_machine_bottom");
        this.back = iiconRegister.registerIcon(Reference.MOD_ID + ":bordel_machine_back");
        this.front = iiconRegister.registerIcon(Reference.MOD_ID + ":bordel_machine_front");
        this.left = iiconRegister.registerIcon(Reference.MOD_ID + ":bordel_machine_left");
        this.right = iiconRegister.registerIcon(Reference.MOD_ID + ":bordel_machine_right");
    }
	
	public IIcon getIcon(int side, int metadata)
    {
		if(side == 0) {
            return this.bottom;
        } else if(side == 1) {
            return this.top;
        } else if (side == 2) {
        	return this.back;
        } else if (side == 3) {
        	return this.front;
        } else if (side == 4) {
        	return this.left;
        } else if (side == 5) {
        	return this.right;
        }
		return this.blockIcon;
        
    }
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		
		if (player.inventory.hasItem(ItemMod.bordel_ingot)) {
			
			player.inventory.consumeInventoryItem(ItemMod.bordel_ingot);
			player.inventory.addItemStackToInventory(new ItemStack(ItemMod.enriched_bordel_ingot));			
			return true;
		}
		return true;

	}
}
