package tree_of_chaos.chemtech;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tree_of_chaos.chemtech.blocks.Cassiterite;
import tree_of_chaos.chemtech.blocks.Chalcopyrite;

public class ModBlocks 
{
    @GameRegistry.ObjectHolder("chemtech:chalcopyrite")
    public static Chalcopyrite chalcopyrite;

    @GameRegistry.ObjectHolder("chemtech:cassiterite")
    public static Cassiterite cassiterite;

    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        Chalcopyrite.initModel();
        Cassiterite.initModel();
    }
}