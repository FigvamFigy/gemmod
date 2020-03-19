package com.figvam.gemmod.blocks.rubyChest;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;


public class ContainerRubyChest extends Container {


    public ContainerRubyChest(InventoryPlayer playerInventory, TileEntityRubyChest tileEntityRubyChest){


        IItemHandler handler = tileEntityRubyChest.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,null);

        createChestInventorySlots(handler);
        createRegularInventorySlots(playerInventory);



    }


    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }


    private void createChestInventorySlots(IItemHandler handler){

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 9; col++){
                this.addSlotToContainer(new SlotItemHandler(handler, col + row * 9, 8 + col * 18, 16 + row * 18));
            }


        }


    }



    private void createRegularInventorySlots(InventoryPlayer playerInventory){
        //Regular inventory
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }


        for (int k = 0; k < 9; ++k)
        {
            this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));

        }
    }
}
