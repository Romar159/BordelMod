package com.mod.snd.init;

import com.mod.snd.BordelMod;
import com.mod.snd.Reference;
import com.mod.snd.init.items.ItemAxeBordelMod;
import com.mod.snd.init.items.ItemPickaxeBordelMod;
import com.mod.snd.init.items.ItemShovelBordelMod;
import com.mod.snd.init.items.ItemSwordBordelMod;
import com.mod.snd.init.items.ItemHoeBordelMod;
import com.mod.snd.init.BlockMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public class ItemMod {
	
	public static ToolMaterial platypusMaterial = EnumHelper.addToolMaterial("platypusMaterial", 4, 60000, 21, 10, 12);
	public static ToolMaterial bordelMaterial = EnumHelper.addToolMaterial("bordelmaterial", 4, 4500, 12, 3, 25);
	
	public static Item 
	item_test, 
	
	bordel_fragment, 
	bordel_ingot, 
	enriched_bordel_ingot,
	
	carcercle_case,
	carcercle_core, 
	advanced_carcercle_core,
	advanced_iron_ingot,
	advanced_iron_ingot_shape,
	blue_core,
	
	platypus_sword, 
	
	bordel_sword,
	bordel_pickaxe, 
	bordel_shovel, 
	bordel_axe, 
	bordel_hoe;
	
	public static void init() {
		
		
		//Items
		//item_test = new Item().setUnlocalizedName("item_test").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":item_test");
		bordel_fragment = new Item().setUnlocalizedName("bordel_fragment").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":bordel_fragment");
		bordel_ingot = new Item().setUnlocalizedName("bordel_ingot").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":bordel_ingot");
		carcercle_case = new Item().setUnlocalizedName("carcercle_case").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":carcercle_case");
		carcercle_core = new Item().setUnlocalizedName("carcercle_core").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":carcercle_core");
		advanced_carcercle_core = new Item().setUnlocalizedName("advanced_carcercle_core").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":advanced_carcercle_core");
		enriched_bordel_ingot = new Item().setUnlocalizedName("enriched_bordel_ingot").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":enriched_bordel_ingot");
		advanced_iron_ingot = new Item().setUnlocalizedName("advanced_iron_ingot").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":advanced_iron_ingot");
		advanced_iron_ingot_shape = new Item().setUnlocalizedName("advanced_iron_ingot_shape").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":advanced_iron_ingot_shape");
		blue_core = new Item().setUnlocalizedName("blue_core").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":blue_core");

		// ajouter un drop à chveuxVert -> des cheveux vert, c'est un 'casque'
		
		//Armes
		platypus_sword = new ItemSwordBordelMod(ItemMod.platypusMaterial).setUnlocalizedName("platypus_sword").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":platypus_sword");
		bordel_sword = new ItemSwordBordelMod(ItemMod.bordelMaterial).setUnlocalizedName("bordel_sword").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":bordel_sword");
		
		//Outils
		bordel_pickaxe = new ItemPickaxeBordelMod(ItemMod.bordelMaterial).setUnlocalizedName("bordel_pickaxe").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":bordel_pickaxe");
		bordel_shovel = new ItemShovelBordelMod(ItemMod.bordelMaterial).setUnlocalizedName("bordel_shovel").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":bordel_shovel");
		bordel_axe = new ItemAxeBordelMod(ItemMod.bordelMaterial).setUnlocalizedName("bordel_axe").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":bordel_axe");
		bordel_hoe = new ItemHoeBordelMod(ItemMod.bordelMaterial).setUnlocalizedName("bordel_hoe").setCreativeTab(BordelMod.bordelTab).setTextureName(Reference.MOD_ID + ":bordel_hoe");
		
	}
	
	public static void register() {
		
		//OreDictionary
		OreDictionary.registerOre("bordel_ingot", bordel_ingot);
		
		//Items
		// GameRegistry.registerItem(item_test, "item test");

		
		GameRegistry.registerItem(bordel_fragment, "bordel_fragment");
		GameRegistry.registerItem(bordel_ingot, "bordel_ingot");
		GameRegistry.registerItem(carcercle_case, "carcercle_case");
		GameRegistry.registerItem(carcercle_core, "carcercle_core");
		GameRegistry.registerItem(advanced_carcercle_core, "advanced_carcercle_core");
		GameRegistry.registerItem(enriched_bordel_ingot, "enriched_bordel_ingot");
		GameRegistry.registerItem(advanced_iron_ingot, "advanced_iron_ingot");
		GameRegistry.registerItem(advanced_iron_ingot_shape, "advanced_iron_ingot_shape");
		GameRegistry.registerItem(blue_core, "blue_core");
		
		//Armes
		GameRegistry.registerItem(platypus_sword, "platypus_sword");
		GameRegistry.registerItem(bordel_sword, "bordel_sword");
		
		//Outils
		GameRegistry.registerItem(bordel_pickaxe, "bordel_pickaxe");
		GameRegistry.registerItem(bordel_shovel, "bordel_shovel");
		GameRegistry.registerItem(bordel_axe, "bordel_axe");
		GameRegistry.registerItem(bordel_hoe, "bordel_hoe");
		
		
		// SMELTING
		
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(ItemMod.advanced_iron_ingot_shape, 1), 0.1F);

		
		// CRAFT
		
		// Outils / Armes
		
	    GameRegistry.addShapedRecipe(new ItemStack(ItemMod.bordel_pickaxe), new Object[]{
	    	    "XXX",
	    	    " Y ",
	    	    " Y ",
	    	    'X', ItemMod.bordel_ingot,
	    	    'Y', Items.stick});
	    
	    GameRegistry.addShapedRecipe(new ItemStack(ItemMod.bordel_shovel), new Object[]{
	    	    "X",
	    	    "Y",
	    	    "Y",
	    	    'X', ItemMod.bordel_ingot,
	    	    'Y', Items.stick});
	    
	    
	    GameRegistry.addShapedRecipe(new ItemStack(ItemMod.bordel_axe), new Object[]{
	    	    "XX",
	    	    "XY",
	    	    " Y",
	    	    'X', ItemMod.bordel_ingot,
	    	    'Y', Items.stick});
	    
	    GameRegistry.addShapedRecipe(new ItemStack(ItemMod.bordel_hoe), new Object[]{
	    	    "XX",
	    	    "Y",
	    	    "Y",
	    	    'X', ItemMod.bordel_ingot,
	    	    'Y', Items.stick});
	    
	    GameRegistry.addShapedRecipe(new ItemStack(ItemMod.bordel_sword), new Object[]{
	    	    "X",
	    	    "X",
	    	    "Y",
	    	    'X', ItemMod.bordel_ingot,
	    	    'Y', Items.stick});
	    
	    // Items
	    
	    
	    GameRegistry.addShapedRecipe(new ItemStack(ItemMod.blue_core), new Object[]{
	    	    "BBB",
	    	    "BIB",
	    	    "BBB",
	    	    'B', ItemMod.enriched_bordel_ingot,
	    	    'I', new ItemStack(Items.dye, 1, 6)});
	   
	    
	    GameRegistry.addShapedRecipe(new ItemStack(ItemMod.carcercle_case), new Object[]{
	    	    "BIB",
	    	    "I I",
	    	    "BIB",
	    	    'B', ItemMod.bordel_ingot,
	    	    'I', ItemMod.advanced_iron_ingot});
	    
	    GameRegistry.addShapedRecipe(new ItemStack(ItemMod.carcercle_core), new Object[]{
	    	    "BIB",
	    	    "I I",
	    	    "BIB",
	    	    'B', ItemMod.bordel_ingot,
	    	    'I', ItemMod.advanced_iron_ingot});
	    
	    GameRegistry.addShapedRecipe(new ItemStack(ItemMod.advanced_carcercle_core), new Object[]{
	    	    "BCB",
	    	    "CDC",
	    	    "BCB",
	    	    'B', ItemMod.bordel_ingot,
	    	    'D', Blocks.diamond_block,
	    	    'C', ItemMod.carcercle_core});
	    
	    GameRegistry.addShapedRecipe(new ItemStack(ItemMod.advanced_iron_ingot), new Object[]{
	    	    "BBB",
	    	    'B', ItemMod.advanced_iron_ingot_shape});
	    

	    
	    // a terme le enriched bordel ingot se fera dans une machine !
	    
	   
	}
}
