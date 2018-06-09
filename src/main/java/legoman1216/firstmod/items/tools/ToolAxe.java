package legoman1216.firstmod.items.tools;

import legoman1216.firstmod.main;
import legoman1216.firstmod.init.ModItems;
import legoman1216.firstmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel
{

	public ToolAxe(String name, ToolMaterial material, float damage, float speed)
	{
		super(material, damage, speed);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(main.MOD_TOOLS);
		
		this.attackDamage = damage;
		this.attackSpeed = speed;
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		main.proxy.registerItemRenderer(this, 0 , "inventory");
	}
	
}
