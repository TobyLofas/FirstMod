package legoman1216.firstmod.objects.blocks.machines.slots;

import legoman1216.firstmod.objects.blocks.machines.TileEntityInfuser;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotInfuserFuel extends Slot 
{

	public SlotInfuserFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) 
	{
		super(inventoryIn, index, xPosition, yPosition);
	}
	
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityInfuser.isItemFuel(stack);
	}
}
