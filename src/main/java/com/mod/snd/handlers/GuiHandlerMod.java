package com.mod.snd.handlers;

import com.mod.snd.blocks.TileEntityBordelMachine;
import com.mod.snd.containers.ContainerBordelMachine;
import com.mod.snd.gui.GuiBordelMachine;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandlerMod implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile = world.getTileEntity(x, y, z);
        if(tile instanceof TileEntityBordelMachine)
        {
            return new ContainerBordelMachine((TileEntityBordelMachine)tile, player.inventory);
        }
        return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		 TileEntity tile = world.getTileEntity(x, y, z);
	        if(tile instanceof TileEntityBordelMachine)
	        {
	            return new GuiBordelMachine((TileEntityBordelMachine)tile, player.inventory);
	        }
	        return null;
	}

}
