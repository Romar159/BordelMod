package com.mod.snd.init;

import com.mod.snd.BordelMod;
import com.mod.snd.Reference;
import com.mod.snd.blocks.BlockBasic;
import com.mod.snd.blocks.BlockTileEntityMod;
import com.mod.snd.blocks.BordelMachine;
import com.mod.snd.blocks.BordelOre;
import com.mod.snd.blocks.TileEntityBordelMachine;
import com.mod.snd.blocks.machines.MachineBordel;
import com.mod.snd.blocks.multiblock.BlockMultiBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BlockMod {

		public static Block bordel_block;
		public static Block lajoie_block;
		public static Block gigasatanas_block;
		public static Block belletete_block;
		public static Block bordel_ore;
		public static Block piaf;
		public static Block aie;
		public static Block omega_obsidienne;
		
		public static Block bordel_machine;
		
		public static Block bordel_casing;
		
		// Vraie bordel machine ( celle du dessus est un test comme un chest ) :
		
		public static Block bordel_furnace;
		
		public static void init() {
			bordel_block = new BlockBasic(Material.rock, 1).setBlockName("bordel_block").setCreativeTab(BordelMod.bordelTab).setBlockTextureName(Reference.MOD_ID + ":bordel_block").setHardness(5.0f);
			lajoie_block = new BlockBasic(Material.rock, 1).setBlockName("lajoie_block").setCreativeTab(BordelMod.bordelTab).setBlockTextureName(Reference.MOD_ID + ":lajoie_block").setHardness(5.0f);
			gigasatanas_block = new BlockBasic(Material.rock, 1).setBlockName("gigasatanas_block").setCreativeTab(BordelMod.bordelTab).setBlockTextureName(Reference.MOD_ID + ":gigasatanas_block").setHardness(5.0f);
			belletete_block = new BlockBasic(Material.rock, 1).setBlockName("belletete_block").setCreativeTab(BordelMod.bordelTab).setBlockTextureName(Reference.MOD_ID + ":belletete_block");
			bordel_ore = new BordelOre(Material.rock, 2).setBlockName("bordel_ore").setCreativeTab(BordelMod.bordelTab).setBlockTextureName(Reference.MOD_ID + ":bordel_ore").setHardness(4F).setResistance(4F);
			piaf = new BlockBasic(Material.rock, 0).setBlockName("piaf").setCreativeTab(BordelMod.bordelTab).setBlockTextureName(Reference.MOD_ID + ":piaf").setHardness(300.0F);
			aie = new BlockBasic(Material.rock, 4).setBlockName("aie").setCreativeTab(BordelMod.bordelTab).setBlockTextureName(Reference.MOD_ID + ":aie").setHardness(35.0F);
			omega_obsidienne = new BlockBasic(Material.rock, 4).setBlockName("omega_obsidienne").setCreativeTab(BordelMod.bordelTab).setBlockTextureName(Reference.MOD_ID + ":omega_obsidienne").setHardness(100.0F).setResistance(150F);
			
			bordel_machine = new BordelMachine(Material.iron, 1).setBlockName("bordel_machine").setCreativeTab(BordelMod.bordelTab).setHardness(2.5f).setResistance(10.0F);;
			
			bordel_casing = new BlockBasic(Material.iron, 1).setBlockName("bordel_casing").setCreativeTab(BordelMod.bordelTab).setBlockTextureName(Reference.MOD_ID + ":bordel_casing").setHardness(4.0f).setResistance(25.0f);
			
			
			// Test zone :
			
				// bordel_machine = new BlockTileEntityMod(Material.rock, 0).setBlockName("bordel_machine").setCreativeTab(BordelMod.bordelTab).setHardness(2.5f).setResistance(10.0F);
		
				// bordel_furnace = new MachineBordel(Material.iron, 1).setBlockName("bordel_furnace").setCreativeTab(BordelMod.bordelTab);
			
				// bordel_casing = new BlockMultiBlock(Material.iron).setBlockName("bordel_casing").setCreativeTab(BordelMod.bordelTab).setHardness(2.5f).setResistance(10.0f);
			
		}
			
		public static void register() {
			GameRegistry.registerBlock(bordel_block, bordel_block.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(lajoie_block, lajoie_block.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(gigasatanas_block, gigasatanas_block.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(belletete_block, belletete_block.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(bordel_ore, bordel_ore.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(piaf, piaf.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(aie, aie.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(omega_obsidienne, omega_obsidienne.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(bordel_machine, bordel_machine.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(bordel_casing, bordel_casing.getUnlocalizedName().substring(5));
			
				// GameRegistry.registerBlock(bordel_furnace, "bordel_furnace");
			
				
			

			
			GameRegistry.addSmelting(new ItemStack(ItemMod.bordel_fragment, 2), new ItemStack(ItemMod.bordel_ingot, 1), 1.0F);
			GameRegistry.addSmelting(BlockMod.aie, new ItemStack(Blocks.dirt, 43), 1.0F);
			
			GameRegistry.addShapedRecipe(new ItemStack(BlockMod.omega_obsidienne), new Object[]{
		    	    "ODO",
		    	    "DOD",
		    	    "ODO",
		    	    'O', Blocks.obsidian,
		    	    'D', Items.diamond});
			
			GameRegistry.addShapedRecipe(new ItemStack(BlockMod.bordel_block), new Object[]{
		    	    "OOO",
		    	    "OOO",
		    	    "OOO",
		    	    'O', ItemMod.bordel_ingot});
			
			GameRegistry.addShapedRecipe(new ItemStack(ItemMod.bordel_ingot, 9), new Object[]{
					"O",
		    	    'O', BlockMod.bordel_block});
			
			
			GameRegistry.addShapedRecipe(new ItemStack(BlockMod.bordel_casing), new Object[]{
					"OOO",
					"OXO",
					"OOO",
		    	    'O', BlockMod.omega_obsidienne,
		    	    'X', ItemMod.bordel_ingot});
			
			GameRegistry.addShapedRecipe(new ItemStack(BlockMod.bordel_machine), new Object[]{
		    	    "XCX",
		    	    "GBG",
		    	    "XCX",
		    	    'X', BlockMod.bordel_casing,
		    	    'C', ItemMod.carcercle_case,
		    	    'B', BlockMod.bordel_block,
		    	    'G', Blocks.gold_block});
		}
		
		
		
}
