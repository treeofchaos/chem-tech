package tree_of_chaos.chemtech.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
public class ChemTechTab extends CreativeTabs
{
	public ChemTechTab(String label) 
	{
		super("leylinestab");
		setBackgroundImageName("item_search.png");
	}
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Item.getItemFromBlock(null));
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
