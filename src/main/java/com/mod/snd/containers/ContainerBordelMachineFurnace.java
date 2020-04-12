package com.mod.snd.containers;

import com.mod.snd.blocks.machines.TileEntityMachineBordel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerBordelMachineFurnace extends Container {
	
	private TileEntityMachineBordel tileBordelMachineFurnace;
	
	 public ContainerBordelMachineFurnace(TileEntityMachineBordel tile, InventoryPlayer inventory)
	    {
	        this.tileBordelMachineFurnace = tile;
	        this.addSlotToContainer(new Slot(this.tileBordelMachineFurnace, 0, 49, 75)); //Lancez votre jeu en debug pour calibrer vos slots
	        this.addSlotToContainer(new Slot(this.tileBordelMachineFurnace, 1, 89, 75));
	        this.addSlotToContainer(new Slot(this.tileBordelMachineFurnace, 2, 129, 75));
	        this.addSlotToContainer(new SlotResult(this.tileBordelMachineFurnace, 3, 89, 135)); //Ici c'est un slot que j'ai créer, on le fera après
	        this.bindPlayerInventory(inventory); //Les containers ont été vus dans un tutoriel de robin, merci de d'y référer
	    }
	 
	 @Override
	    public boolean canInteractWith(EntityPlayer player) {
	        return this.tileBordelMachineFurnace.isUseableByPlayer(player);
	    }
	 
	    private void bindPlayerInventory(InventoryPlayer inventory)
	    {
	        int i;
	        for (i = 0; i < 3; ++i)
	        {
	            for (int j = 0; j < 9; ++j)
	            {
	                this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 17 + j * 18, 171 + i * 18));
	            }
	        }
	 
	        for (i = 0; i < 9; ++i)
	        {
	            this.addSlotToContainer(new Slot(inventory, i, 17 + i * 18, 229));
	        }
	    }
	 
	    public ItemStack transferStackInSlot(EntityPlayer player, int quantity)
	    {
	        ItemStack itemstack = null;
	        Slot slot = (Slot)this.inventorySlots.get(quantity);
	 
	        if (slot != null && slot.getHasStack())
	        {
	            ItemStack itemstack1 = slot.getStack();
	            itemstack = itemstack1.copy();
	 
	            if (quantity < this.tileBordelMachineFurnace.getSizeInventory())
	            {
	                if (!this.mergeItemStack(itemstack1, this.tileBordelMachineFurnace.getSizeInventory(), this.inventorySlots.size(), true))
	                {
	                    return null;
	                }
	            }
	            else if (!this.mergeItemStack(itemstack1, 0, this.tileBordelMachineFurnace.getSizeInventory(), false))
	            {
	                return null;
	            }
	 
	            if (itemstack1.stackSize == 0)
	            {
	                slot.putStack((ItemStack)null);
	            }
	            else
	            {
	                slot.onSlotChanged();
	            }
	        }
	 
	        return itemstack;
	    }
	 
	    public void onContainerClosed(EntityPlayer player)
	    {
	        super.onContainerClosed(player);
	        this.tileBordelMachineFurnace.closeInventory();
	    }
	

}
