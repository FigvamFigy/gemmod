package com.figvam.gemmod.blocks.doubleFurance;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDoubleFurnace extends Block {



    private static BlockDoubleFurnace instance = null;

    private BlockDoubleFurnace(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);


        setUnlocalizedName("double_furnace");
        setRegistryName("double_furnace");
    }

    public static BlockDoubleFurnace getInstance(){
        if(instance == null){
            instance = new BlockDoubleFurnace();
        }
        return instance;
    }


}
