package com.figvam.gemmod.blocks.rubyChest;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TileEntityRubyChest extends TileEntity {


    private static TileEntityRubyChest instance;

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

    public static TileEntityRubyChest getTileEntity(IBlockAccess world, BlockPos pos){

        return (TileEntityRubyChest) world.getTileEntity(pos);
    }

}
