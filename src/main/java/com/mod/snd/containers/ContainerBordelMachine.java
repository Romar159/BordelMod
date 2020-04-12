package com.mod.snd.containers;

import com.mod.snd.blocks.TileEntityBordelMachine;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerBordelMachine extends Container {

	private final TileEntityBordelMachine tileBordelMachine;
	 
    public ContainerBordelMachine(TileEntityBordelMachine tile, InventoryPlayer inventory)
    {
        this.tileBordelMachine = tile;
        
        tile.openInventory();
        for(int i = 0; i < 3; ++i)
        {
            for(int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(tile, j + i * 9, 8 + j * 18, 18 + i * 18));
            }
        }
        this.bindPlayerInventory(inventory);
    }
 
    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return this.tileBordelMachine.isUseableByPlayer(player);
    }
    
    private void bindPlayerInventory(InventoryPlayer inventory)
    {
        int i;
        for(i = 0; i < 3; ++i)
        {
            for(int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 86 + i * 18));
            }
        }
 
        for(i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 144));
        }
    }
    
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotIndex);
 
        if(slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
 
            if(slotIndex < this.tileBordelMachine.getSizeInventory())
            {
                if(!this.mergeItemStack(itemstack1, this.tileBordelMachine.getSizeInventory(), this.inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if(!this.mergeItemStack(itemstack1, 0, this.tileBordelMachine.getSizeInventory(), false))
            {
                return null;
            }
 
            if(itemstack1.stackSize == 0)
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

}
