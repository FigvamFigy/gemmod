package com.figvam.gemmod.blocks.doubleFurance;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class DoubleFurnaceTileEntity extends TileEntity {


    private int count;

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


}
