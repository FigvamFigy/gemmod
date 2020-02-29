package com.figvam.gemmod.items.itemBlocks.doubleFurnace;

import com.figvam.gemmod.blocks.doubleFurance.BlockDoubleFurnace;
import net.minecraft.item.ItemBlock;

public class ItemBlockDoubleFurnace extends ItemBlock {



    private static ItemBlockDoubleFurnace instance = null;

    private static final BlockDoubleFurnace BLOCK_DOUBLE_FURNACE = BlockDoubleFurnace.getInstance();

    private ItemBlockDoubleFurnace(){
        super(BLOCK_DOUBLE_FURNACE);


        //Registry stuff
        setUnlocalizedName(BLOCK_DOUBLE_FURNACE.getUnlocalizedName());
        setRegistryName(BLOCK_DOUBLE_FURNACE.getRegistryName());
    }

    public static ItemBlockDoubleFurnace getInstance(){
        if(instance == null){
            instance = new ItemBlockDoubleFurnace();
        }
        return instance;
    }
}
