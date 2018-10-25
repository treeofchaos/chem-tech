package tree_of_chaos.chemtech.world;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import tree_of_chaos.chemtech.ModBlocks;

public class ChemTechOreGen implements IWorldGenerator
{
    private static boolean retrogen = false;
    public static ChemTechOreGen instance = new ChemTechOreGen();
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        if (world.provider.getDimension() == 0)
        {
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        generateOre(ModBlocks.chalcopyrite.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 128, 4 + random.nextInt(8), 20);
        generateOre(ModBlocks.cassiterite.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 128, 4 + random.nextInt(8), 15);
        generateOre(ModBlocks.galena.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 30, 4 + random.nextInt(8), 10);
        generateOre(ModBlocks.garnierite.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(8), 12);
        generateOre(ModBlocks.wolframite.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 25, 4 + random.nextInt(8), 9);
        generateOre(ModBlocks.uraninite.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 20, 4 + random.nextInt(8), 6);
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
    {
        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++)
        {
            BlockPos pos= new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world, random, pos);
        }
    }
}
