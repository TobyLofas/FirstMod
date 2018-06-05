package legoman1216.firstmod.items.tools;

import legoman1216.firstmod.main;
import legoman1216.firstmod.init.ModItems;
import legoman1216.firstmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{


	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		main.proxy.registerItemRenderer(this, 0 , "inventory");
	}

	
}
