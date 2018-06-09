package legoman1216.firstmod.init;

import java.util.ArrayList;
import java.util.List;

import legoman1216.firstmod.items.ItemBase;
import legoman1216.firstmod.items.tools.ToolAxe;
import legoman1216.firstmod.items.tools.ToolHoe;
import legoman1216.firstmod.items.tools.ToolPickaxe;
import legoman1216.firstmod.items.tools.ToolSpade;
import legoman1216.firstmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 3, 3122, 7.5F, 3.0F, 5);
	public static final ToolMaterial MATERIAL_REDSTONE = EnumHelper.addToolMaterial("material_redstone", 3, 220, 8.0F, 1.0F, 20);
	
	//Items
	public static final Item OBSIDIAN_ALLOY_INGOT = new ItemBase("obsidian_alloy_ingot");
	public static final Item REDSTONE_ALLOY_INGOT = new ItemBase("redstone_alloy_ingot");
	public static final Item OBSIDIAN_DUST = new ItemBase("obsidian_dust");
	
	//Tools
	//Redstone
	public static final ItemSword REDSTONE_SWORD = new ToolSword("redstone_sword", MATERIAL_REDSTONE);
	
	//Obsidian
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN, 8.0F, -3.2F);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN);
	

	
}