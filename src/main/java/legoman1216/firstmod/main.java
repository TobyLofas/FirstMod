package legoman1216.firstmod;

import legoman1216.firstmod.init.ModBlocks;
import legoman1216.firstmod.init.ModItems;
import legoman1216.firstmod.init.ModRecipes;
import legoman1216.firstmod.proxy.CommonProxy;
import legoman1216.firstmod.util.reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = reference.MOD_ID, name = reference.NAME, version = reference.VERSION)
public class main {

	@Instance
	public static main instance;
	
	public static CreativeTabs MOD_BLOCKS = new CreativeTabs("mod_blocks")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack (Item.getItemFromBlock(ModBlocks.OBSIDIAN_ALLOY_BLOCK));
		}
	};
	
	public static CreativeTabs MOD_ITEMS = new CreativeTabs("mod_items")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ModItems.OBSIDIAN_ALLOY_INGOT);
		}
	};
	
	public static CreativeTabs MOD_TOOLS = new CreativeTabs("mod_tools")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ModItems.OBSIDIAN_AXE);
		}
	};
	
	@SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}