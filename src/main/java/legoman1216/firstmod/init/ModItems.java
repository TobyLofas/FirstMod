package legoman1216.firstmod.init;

import java.util.ArrayList;
import java.util.List;

import legoman1216.firstmod.items.ItemBase;
import legoman1216.firstmod.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 3, 3122, 7.5F, 3.0F, 5);
	
	//Items
	public static final Item OBSIDIAN_ALLOY_INGOT = new ItemBase("obsidian_alloy_ingot");
	public static final Item REDSTONE_ALLOY_INGOT = new ItemBase("redstone_alloy_ingot");
	public static final Item OBSIDIAN_DUST = new ItemBase("obsidian_dust");
	
	//Tools
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
	
}