package com.figvam.gemmod.items.itemBlocks.ruby;

import com.figvam.gemmod.blocks.ruby.BlockRuby;
import net.minecraft.item.ItemBlock;

public class ItemBlockRuby extends ItemBlock {

    private static ItemBlockRuby instance = null;

    private static final BlockRuby BLOCK_RUBY = BlockRuby.getInstance();

    private ItemBlockRuby(){
        super(BLOCK_RUBY);


        //Registry stuff
        setUnlocalizedName(BLOCK_RUBY.getUnlocalizedName());
        setRegistryName(BLOCK_RUBY.getRegistryName());
    }

    public static ItemBlockRuby getInstance(){
        if(instance == null){
            instance = new ItemBlockRuby();
        }
        return instance;
    }



}
