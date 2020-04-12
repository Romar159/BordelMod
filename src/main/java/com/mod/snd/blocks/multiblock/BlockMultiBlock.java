package com.mod.snd.blocks.multiblock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockMultiBlock extends BlockContainer {
	
	public BlockMultiBlock(Material material) {
		super(material);
	}
	
	@Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile != null && tile instanceof bordelEnrichissementMultiBlock) {
        	bordelEnrichissementMultiBlock multiBlock = (bordelEnrichissementMultiBlock) tile;
            if (multiBlock.hasMaster()) {
                if (multiBlock.isMaster()) {
                    if (!multiBlock.checkMultiBlockForm())
                        multiBlock.resetStructure();
                } else {
                    if (!multiBlock.checkForMaster()) {
                        multiBlock.reset();
                        world.markBlockForUpdate(x, y, z);
                    }
                }
            }
        }
        super.onNeighborBlockChange(world, x, y, z, block);
    }

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new bordelEnrichissementMultiBlock();
		
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
    	
		System.out.println("Activated !");
    	return true;
    	
    }


    

}
