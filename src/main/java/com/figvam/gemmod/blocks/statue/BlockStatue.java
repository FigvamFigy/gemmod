package com.figvam.gemmod.blocks.statue;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStatue extends Block {


    private static BlockStatue instance = null;

    private BlockStatue(){
        super(Material.ROCK);

        setCreativeTab(CreativeTabs.DECORATIONS);

        setUnlocalizedName("statue");
        setRegistryName("statue");

    }

    public static BlockStatue getInstance(){
        if(instance == null){
            instance = new BlockStatue();
        }
        return instance;
    }



}
