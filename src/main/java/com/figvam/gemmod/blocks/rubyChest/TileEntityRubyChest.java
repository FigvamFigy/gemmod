package com.figvam.gemmod.blocks.rubyChest;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityRubyChest extends TileEntity {


    private static TileEntityRubyChest instance;
    private ItemStackHandler itemStackHandler = new ItemStackHandler(27);

    int count;

    public TileEntityRubyChest(){
        super();
        this.count = 0;
    }


    public static TileEntityRubyChest getInstance(){
        if(instance == null){
            instance = new TileEntityRubyChest();
        }
        return instance;
    }



    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setInteger("count",count);
        compound.setTag("inventory",this.itemStackHandler.serializeNBT());

        return super.writeToNBT(compound);
    }



    @Override
    public void readFromNBT(NBTTagCompound compound) {
        this.itemStackHandler.deserializeNBT(compound.getCompoundTag("inventory"));
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

    public static TileEntityRubyChest getTileEntity(IBlockAccess world, BlockPos pos){

        return (TileEntityRubyChest) world.getTileEntity(pos);
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return (T) this.itemStackHandler;
        }
        return super.getCapability(capability, facing);
    }



}
