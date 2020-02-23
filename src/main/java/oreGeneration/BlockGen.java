package oreGeneration;

import com.figvam.gemmod.blocks.ruby.BlockRubyOre;
import com.figvam.gemmod.registries.BlockModList;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;
import java.util.function.Predicate;

public class BlockGen implements IWorldGenerator {


    private static BlockGen instance = null;

    public static BlockGen getInstance(){
        if(instance == null){
            instance = new BlockGen();
        }
        return instance;
    }



    //World gen stuff
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        generateOre(BlockRubyOre.getInstance().getDefaultState(), world, random,
                chunkX * 16, chunkZ * 16, 10, 20, 3 + random.nextInt(4), 5);
    }

    /**
     *
     *
     *
     * @param ore
     * @param world
     * @param random
     * @param x chunk
     * @param z chunk
     * @param minY elemevation
     * @param maxY elevation
     * @param size vein size
     * @param chances Number of veins per chunk
     */
    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances){

        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world, random, pos);
        }
    }





}
