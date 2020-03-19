package com.figvam.gemmod.blocks.rubyChest;

import net.minecraft.tileentity.TileEntity;

public class TileEntityRubyChest extends TileEntity {


    private static TileEntityRubyChest instance;

    private TileEntityRubyChest(){
        super();

    }


    public static TileEntityRubyChest getInstance(){
        if(instance == null){
            instance = new TileEntityRubyChest();
        }
        return instance;
    }





}
