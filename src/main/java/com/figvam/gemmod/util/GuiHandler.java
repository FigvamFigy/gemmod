package com.figvam.gemmod.util;

import com.figvam.gemmod.blocks.doubleFurance.ContainerDoubleFurnace;
import com.figvam.gemmod.blocks.doubleFurance.DoubleFurnaceTileEntity;
import com.figvam.gemmod.blocks.doubleFurance.GUIDoubleFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {


    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if(!world.isRemote){
            return new ContainerDoubleFurnace(player.inventory,(DoubleFurnaceTileEntity)world.getTileEntity(new BlockPos(x,y,z)));
        }


        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        switch (ID){
            case 0: return new GUIDoubleFurnace(new ContainerDoubleFurnace(player.inventory,(DoubleFurnaceTileEntity)world.getTileEntity(new BlockPos(x,y,z))));

        }
        return null;

    }
}
