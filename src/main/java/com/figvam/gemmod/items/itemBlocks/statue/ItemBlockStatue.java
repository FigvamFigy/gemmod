package com.figvam.gemmod.items.itemBlocks.statue;

import com.figvam.gemmod.blocks.statue.BlockStatue;
import net.minecraft.item.ItemBlock;

public class ItemBlockStatue extends ItemBlock {

    private static final BlockStatue BLOCK_STATUE = BlockStatue.getInstance();
    private static ItemBlockStatue instance = null;



    private ItemBlockStatue(){
        super(BLOCK_STATUE);

        setUnlocalizedName(BLOCK_STATUE.getUnlocalizedName());
        setRegistryName(BLOCK_STATUE.getRegistryName());

    }


    public static ItemBlockStatue getInstance(){
        if(instance == null){
            instance = new ItemBlockStatue();
        }
        return instance;
    }



}
