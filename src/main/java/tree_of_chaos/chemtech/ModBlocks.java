package tree_of_chaos.chemtech;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tree_of_chaos.chemtech.blocks.*;

public class ModBlocks 
{
    @GameRegistry.ObjectHolder("chemtech:chalcopyrite")
    public static Chalcopyrite chalcopyrite;

    @GameRegistry.ObjectHolder("chemtech:cassiterite")
    public static Cassiterite cassiterite;

    @GameRegistry.ObjectHolder("chemtech:uraninite")
    public static Uraninite uraninite;

    @GameRegistry.ObjectHolder("chemtech:galena")
    public static Galena galena;

    @GameRegistry.ObjectHolder("chemtech:wolframite")
    public static Wolframite wolframite;

    @GameRegistry.ObjectHolder("chemtech:garnierite")
    public static Garnierite garnierite;

    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        /*
        Chalcopyrite.initModel();
        Cassiterite.initModel();
        Uraninite.initModel();
        */
    }
}