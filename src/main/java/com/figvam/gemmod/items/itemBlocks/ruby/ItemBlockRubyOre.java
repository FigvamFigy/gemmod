package com.figvam.gemmod.items.itemBlocks.ruby;

import com.figvam.gemmod.blocks.ruby.BlockRubyOre;
import net.minecraft.item.ItemBlock;

public class ItemBlockRubyOre extends ItemBlock {

    private static final BlockRubyOre BLOCK_RUBY_ORE = BlockRubyOre.getInstance();

    private static ItemBlockRubyOre instance = null;

    private ItemBlockRubyOre(){
        super(BLOCK_RUBY_ORE);

        setUnlocalizedName(BLOCK_RUBY_ORE.getUnlocalizedName());
        setRegistryName(BLOCK_RUBY_ORE.getRegistryName());
    }


    public static ItemBlockRubyOre getInstance(){
        if(instance == null){
            instance = new ItemBlockRubyOre();
        }
        return instance;
    }
}
