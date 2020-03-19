package com.figvam.gemmod.util;

import com.figvam.gemmod.blocks.rubyChest.ContainerRubyChest;
import com.figvam.gemmod.blocks.rubyChest.GuiRubyChest;
import com.figvam.gemmod.blocks.rubyChest.TileEntityRubyChest;
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
            if(ID == GuiReference.RUBY_CHEST_GUI_ID){
                return new ContainerRubyChest(player.inventory,(TileEntityRubyChest)world.getTileEntity(new BlockPos(x,y,z)));
            }
        }

        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == GuiReference.RUBY_CHEST_GUI_ID){

            return new GuiRubyChest(player.inventory,(TileEntityRubyChest)world.getTileEntity(new BlockPos(x,y,z)));
        }

        return null;
    }
}
