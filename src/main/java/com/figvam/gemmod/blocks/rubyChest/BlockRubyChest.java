package com.figvam.gemmod.blocks.rubyChest;

import com.figvam.gemmod.blocks.ruby.BlockRuby;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRubyChest extends Block {



    private static BlockRubyChest instance = null;

    private BlockRubyChest(){
        super(Material.IRON);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        //Regitry stuff
        setUnlocalizedName("ruby_chest");
        setRegistryName("ruby_chest");

    }

    public static BlockRubyChest getInstance(){
        if(instance == null){
            instance = new BlockRubyChest();
        }
        return instance;
    }


}
