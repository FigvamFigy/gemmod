package com.figvam.gemmod.registries;

import com.figvam.gemmod.blocks.doubleFurance.BlockDoubleFurnace;
import com.figvam.gemmod.blocks.doubleFurance.DoubleFurnaceTileEntity;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;

public class TileEntityModList {


    public static final TileEntity[] TILE_ENTITY_LIST = {
            DoubleFurnaceTileEntity.getInstance()//Double Furnace Tile Entity
    };


    //This list contains all the blocks that have tile entities. This must be in the same order as TILE_ENTITY_LIST to work
    public static final Block[] BLOCK_LIST = {
            BlockDoubleFurnace.getInstance()//Double Furnace
    };


}
