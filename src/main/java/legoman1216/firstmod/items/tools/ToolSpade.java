package legoman1216.firstmod.items.tools;

import legoman1216.firstmod.main;
import legoman1216.firstmod.init.ModItems;
import legoman1216.firstmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel
{
	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(main.MOD_TOOLS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		main.proxy.registerItemRenderer(this, 0 , "inventory");
	}

	

}
