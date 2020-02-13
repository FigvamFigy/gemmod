package com.figvam.gemmod.blocks.ruby;

import com.figvam.gemmod.items.ruby.ItemRuby;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class BlockRubyOre extends Block {

    private static BlockRubyOre instance = null;

    private BlockRubyOre(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(2.5f);
        setLightLevel(0);
        setLightOpacity(0);
        setHarvestLevel("pickaxe",3);/** The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) */

        //Registry
        setUnlocalizedName("block_ruby_ore");
        setRegistryName("block_ruby_ore");
    }

    public static BlockRubyOre getInstance(){
        if(instance == null){
            instance = new BlockRubyOre();
        }
        return instance;
    }


    @Override
    public Item getItemDropped(IBlockState blockState, Random random, int fortune){
        return ItemRuby.getInstance();
    }

    //Without fortune
    @Override
    public int quantityDropped(IBlockState blockState, int fortune, Random random){
        return quantityDroppedWithBonus(fortune,random);
    }

    //With Fortune
    @Override
    public int quantityDroppedWithBonus(int fortuneLevel, Random random){

        if (fortuneLevel > 0 && Item.getItemFromBlock(instance) != this.getItemDropped(this.getDefaultState(), random, fortuneLevel))
        {
            int i = random.nextInt(fortuneLevel + 3) - 1;
            if (i < 0)
            {
                i = 0;
            }
            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }

    }


    //EXP
    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
    {
        return 2;
    }
}
