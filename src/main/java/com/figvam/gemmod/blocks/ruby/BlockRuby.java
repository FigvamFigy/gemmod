package com.figvam.gemmod.blocks.ruby;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockRuby extends Block {

    private static BlockRuby instance = null;

    private BlockRuby(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(2.0f);
        setLightLevel(0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("pickaxe",3);/** The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) */



        //I am testing stuff
        //Registry stuff
        setUnlocalizedName("block_ruby");
        setRegistryName("block_ruby");

    }

    public static BlockRuby getInstance(){
        if(instance == null){
            instance = new BlockRuby();
        }
        return instance;
    }

}
