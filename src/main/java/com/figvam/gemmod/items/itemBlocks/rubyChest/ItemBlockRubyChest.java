package com.figvam.gemmod.items.itemBlocks.rubyChest;

import com.figvam.gemmod.blocks.rubyChest.BlockRubyChest;
import net.minecraft.item.ItemBlock;

public class ItemBlockRubyChest extends ItemBlock {

    private static final BlockRubyChest BLOCK_RUBY_CHEST = BlockRubyChest.getInstance();

    private static ItemBlockRubyChest instance = null;

    private ItemBlockRubyChest(){
        super(BLOCK_RUBY_CHEST);

        //Registry stuff
        setUnlocalizedName(BLOCK_RUBY_CHEST.getUnlocalizedName());
        setRegistryName(BLOCK_RUBY_CHEST.getRegistryName());

    }

    public static ItemBlockRubyChest getInstance(){
        if(instance == null){
            instance = new ItemBlockRubyChest();
        }
        return instance;
    }

}
