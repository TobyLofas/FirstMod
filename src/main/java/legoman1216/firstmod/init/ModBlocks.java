package legoman1216.firstmod.init;

import java.util.ArrayList;
import java.util.List;

import legoman1216.firstmod.blocks.BlockBase;
import legoman1216.firstmod.objects.blocks.machines.BlockInfuser;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block REDSTONE_ALLOY_BLOCK = new BlockBase("redstone_alloy_block", Material.IRON, 3.0F, 27.0F, "pickaxe", 2, SoundType.METAL);
	public static final Block OBSIDIAN_ALLOY_BLOCK = new BlockBase("obsidian_alloy_block", Material.IRON, 50.0F, 6000.0F, "pickaxe", 3, SoundType.METAL);
	public static final Block INFUSER = new BlockInfuser("infuser");
}