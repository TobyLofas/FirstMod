package legoman1216.firstmod.blocks;

import legoman1216.firstmod.main;
import legoman1216.firstmod.init.ModBlocks;
import legoman1216.firstmod.init.ModItems;
import legoman1216.firstmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBase extends Block implements IHasModel
{

	public BlockBase(String name, Material material, float hardness, float resistance, String tool, int level, SoundType sound)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(main.MOD_BLOCKS);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(tool, level);
		//setLightLevel(light);
		//setLightOpacity(opacity)
		setSoundType(sound);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		
		main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
