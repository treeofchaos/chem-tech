package tree_of_chaos.chemtech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tree_of_chaos.chemtech.ChemTech;

public class Garnierite extends Block
{
    public Garnierite()
    {
        super(Material.ROCK);
        setUnlocalizedName(ChemTech.MODID +".garnierite");
        setRegistryName("garnierite");
        setSoundType(SoundType.STONE);
        setHardness(5.0f);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(ChemTech.chemtechtab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel()
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
