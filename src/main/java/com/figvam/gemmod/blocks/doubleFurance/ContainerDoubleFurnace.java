package com.figvam.gemmod.blocks.doubleFurance;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.tileentity.TileEntityBrewingStand;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.util.ITickable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerDoubleFurnace extends Container {


    private final DoubleFurnaceTileEntity tileEntity;
    private int cookTime;
    private int totalCookTime;
    private int furanceBurnTime;
    private int currentItemBurnTime;

    public ContainerDoubleFurnace(InventoryPlayer playerInventory, DoubleFurnaceTileEntity passedFurnaceInventory){
        this.tileEntity = passedFurnaceInventory;

        IItemHandler handler = tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,null);
        System.out.println(playerInventory);


        this.addSlotToContainer(new SlotItemHandler(handler,0,39,16));//Left cooking area
        this.addSlotToContainer(new SlotItemHandler(handler,0,73,16));//right cooking area

        this.addSlotToContainer(new SlotItemHandler(handler,0,56,53));//fuel area

        System.out.println("Inside Inv");
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
                System.out.print(j + i * 9 + 9 + " ");
            }
            System.out.println();
        }


        System.out.println("Hot Bar");
        for (int k = 0; k < 9; ++k)
        {
            this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));
            System.out.print(k + " ");
        }

    }


    public void addListener(IContainerListener listener)
    {
        super.addListener(listener);
        //listener.sendAllWindowProperties(this, this.tileEntity);
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

//    @Override
//    public boolean canInteractWith(EntityPlayer playerIn) {
//        return this.furnaceInventory.isUsableByPlayer(playerIn);
//    }

    // Populates GUI inventory section to Players current hot bar and inventory
}
