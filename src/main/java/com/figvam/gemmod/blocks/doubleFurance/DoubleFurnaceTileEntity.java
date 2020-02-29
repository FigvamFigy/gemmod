package com.figvam.gemmod.blocks.doubleFurance;

import net.minecraft.tileentity.TileEntity;

public class DoubleFurnaceTileEntity extends TileEntity {


    private static DoubleFurnaceTileEntity instance = null;

    private DoubleFurnaceTileEntity(){
        super();
    }

    public static DoubleFurnaceTileEntity getInstance(){
        if(instance == null){
            instance = new DoubleFurnaceTileEntity();
        }
        return instance;
    }



}
