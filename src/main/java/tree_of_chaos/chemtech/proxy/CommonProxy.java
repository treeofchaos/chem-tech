package tree_of_chaos.chemtech.proxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tree_of_chaos.chemtech.blocks.*;
import tree_of_chaos.chemtech.ModBlocks;
import tree_of_chaos.chemtech.world.ChemTechOreGen;

@Mod.EventBusSubscriber
public class CommonProxy 
{
    public void preInit(FMLPreInitializationEvent e) 
    {
        GameRegistry.registerWorldGenerator(new ChemTechOreGen(), 3);
    }

    public void init(FMLInitializationEvent e)
    {
    }

    public void postInit(FMLPostInitializationEvent e) 
    {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) 
    {
    	event.getRegistry().register(new Chalcopyrite());
        event.getRegistry().register(new Cassiterite());
        event.getRegistry().register(new Uraninite());
        event.getRegistry().register(new Galena());
        event.getRegistry().register(new Wolframite());
        event.getRegistry().register(new Garnierite());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) 
    {
    	event.getRegistry().register(new ItemBlock(ModBlocks.chalcopyrite).setRegistryName(ModBlocks.chalcopyrite.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.cassiterite).setRegistryName(ModBlocks.cassiterite.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.uraninite).setRegistryName(ModBlocks.uraninite.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.galena).setRegistryName(ModBlocks.galena.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.wolframite).setRegistryName(ModBlocks.wolframite.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.garnierite).setRegistryName(ModBlocks.garnierite.getRegistryName()));
    }
}
