package com.figvam.gemmod.blocks.doubleFurance;


import com.figvam.gemmod.GemmodMain;
import com.figvam.gemmod.util.GuiResource;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import org.lwjgl.Sys;

import javax.annotation.Nullable;

public class BlockDoubleFurnace extends Block {

//Test

    private static BlockDoubleFurnace instance = null;

    private BlockDoubleFurnace(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);


        setUnlocalizedName("double_furnace");
        setRegistryName("double_furnace");
    }

    public static BlockDoubleFurnace getInstance(){
        if(instance == null){
            instance = new BlockDoubleFurnace();
        }
        return instance;
    }


    //Tile Entity stuffs
    @Override
    public boolean hasTileEntity(IBlockState state){
        return true;
    }


    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        //return super.createTileEntity(world, state);
        return DoubleFurnaceTileEntity.getInstance();
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote){//This says, if the side is the PHYSICAL SERVER, NOT ANY CLIENTS, then do logic
//            DoubleFurnaceTileEntity tile = DoubleFurnaceTileEntity.getTileEntity(worldIn,pos);
//
//            tile.incrementCount();
//            playerIn.sendMessage(new TextComponentString("Count: " + tile.getCount()));

            //playerIn.openGui(GemmodMain.instance,GuiResource.GUI_TEST,worldIn,pos.getX(),pos.getY(),pos.getZ());


        }
        playerIn.openGui(GemmodMain.instance,GuiResource.GUI_TEST,worldIn,pos.getX(),pos.getY(),pos.getZ());


        return true;
    }
}
