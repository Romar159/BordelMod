package com.mod.snd.gui;

import org.lwjgl.opengl.GL11;

import com.mod.snd.Reference;
import com.mod.snd.blocks.machines.TileEntityMachineBordel;
import com.mod.snd.containers.ContainerBordelMachineFurnace;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiBordelMachineFurnace extends GuiContainer{
	
	private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID,"textures/gui/container/guiBordelMachineFurnace.png");
    @SuppressWarnings("unused")
    private TileEntityMachineBordel tileMachineTuto;
    private IInventory playerInv;
 
    public GuiBordelMachineFurnace(TileEntityMachineBordel tile, InventoryPlayer inventory)
    {
        super(new ContainerBordelMachineFurnace(tile, inventory));
        this.tileMachineTuto = tile;
        this.playerInv = inventory;
        this.allowUserInput = false;
        /*this.ySize = 256;
        this.xSize = 256;*/
        
        this.ySize = 207;
        this.xSize = 195;

    }
 
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialRenderTick, int x, int y)
    {
 
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        this.drawTexturedModalRect(0, 0, 176, 14, 100 + 1, 16);
        
        if(this.tileMachineTuto.isBurning())
        {
            int i = this.tileMachineTuto.getCookProgress(); 
            //this.drawTexturedModalRect(x, y, u, v, width, height);
            this.drawTexturedModalRect(k + 47, l + 46, 0, 2, 100, i);
        }
 
    }
 
    protected void drawGuiContainerForegroundLayer(int x, int y)
    {
        this.fontRendererObj.drawString(this.playerInv.hasCustomInventoryName() ? this.playerInv.getInventoryName() : I18n.format(this.playerInv.getInventoryName()), 10, this.ySize - 98, 4210752);
    }

}
