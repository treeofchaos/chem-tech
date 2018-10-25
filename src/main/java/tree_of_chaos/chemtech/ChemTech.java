package tree_of_chaos.chemtech;
import java.util.logging.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tree_of_chaos.chemtech.creativetab.ChemTechTab;
import tree_of_chaos.chemtech.proxy.CommonProxy;

@Mod(modid = ChemTech.MODID, name = ChemTech.MODNAME, version = ChemTech.MODVERSION, dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true)
public class ChemTech 
{
    public static final String MODID = "chemtech";
    public static final String MODNAME = "ChemTech";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "tree_of_chaos.chemtech.proxy.ClientProxy", serverSide = "tree_of_chaos.chemtech.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    public static final CreativeTabs chemtechtab = new ChemTechTab("chemtechtab");
    
    @Mod.Instance
    public static ChemTech instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
        //logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) 
    {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {

        proxy.postInit(e);
    }
}