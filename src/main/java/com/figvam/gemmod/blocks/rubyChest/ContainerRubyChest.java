package com.figvam.gemmod.blocks.rubyChest;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;


public class ContainerRubyChest extends Container {


    public ContainerRubyChest(InventoryPlayer playerInventory, TileEntityRubyChest passedFurnaceInventory){

    }


    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
