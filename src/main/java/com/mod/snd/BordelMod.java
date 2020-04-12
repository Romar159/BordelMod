package com.mod.snd;

import com.mod.snd.blocks.TileEntityBordelMachine;
import com.mod.snd.blocks.machines.TileEntityMachineBordel;
import com.mod.snd.blocks.multiblock.bordelEnrichissementMultiBlock;
import com.mod.snd.handlers.GuiHandlerMod;
import com.mod.snd.init.BlockMod;
import com.mod.snd.init.EntityMod;
import com.mod.snd.init.ItemMod;
import com.mod.snd.proxy.CommonProxy;
import com.mod.snd.world.WorldRegister;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class BordelMod {
	
	@Instance(Reference.MOD_ID)
	public static BordelMod instance;
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	public static CreativeTabs bordelTab = new CreativeTabs("bordelTab") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BlockMod.bordel_block);
		}
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ItemMod.init();
		ItemMod.register();
		BlockMod.init();
		BlockMod.register();
		WorldRegister.mainRegistry();
	
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.registerRenders();
		EntityMod.init();
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandlerMod());
		
		
		// GameRegistry.registerTileEntity(TileEntityMachineBordel.class, "bordelmodBordelMachineFurnace");
		// GameRegistry.registerTileEntity(TileEntityBordelMachine.class, "bordelmodbordelmachine");
		// GameRegistry.registerTileEntity(bordelEnrichissementMultiBlock.class, "bordelmod:bordelEnrichissementMultiBlock");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
