package tree_of_chaos.chemtech;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Uraninite extends Block
{
    public Uraninite()
    {
        super(Material.ROCK);
        setUnlocalizedName(ChemTech.MODID +".uraninite");
        setRegistryName("uraninite");
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
