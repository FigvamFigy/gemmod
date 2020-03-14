package com.figvam.gemmod.blocks.doubleFurance;

import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class DoubleFurnaceTileEntity extends TileEntity implements ITickable {


    private int count;
    public ItemStackHandler handler = new ItemStackHandler(1);

    private static DoubleFurnaceTileEntity instance = null;

    private DoubleFurnaceTileEntity(){
        super();
        //count = 0;
    }

    public static DoubleFurnaceTileEntity getInstance(){
        if(instance == null){
            instance = new DoubleFurnaceTileEntity();
        }
        return instance;
    }


    public static DoubleFurnaceTileEntity getTileEntity(IBlockAccess world, BlockPos pos){

        return (DoubleFurnaceTileEntity)world.getTileEntity(pos);
    }

    //Saving data inside a tile entity


    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {

        compound.setInteger("count",count);

        return super.writeToNBT(compound);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        count = compound.getInteger("count");

        super.readFromNBT(compound);
    }

    public int getCount(){
        return count;
    }

    public void incrementCount(){
        count++;
        markDirty();
    }

    private void decrementCount(){
        count--;
        markDirty();
    }

    @Override
    public void update() {

    }


    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return (T)this.handler;
        return super.getCapability(capability, facing);
    }


    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
        return super.hasCapability(capability, facing);
    }
}
