package com.figvam.gemmod.blocks.cookieJar;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCookieJar extends Block {

    public static final AxisAlignedBB COOKIE_JAR_AABB = new AxisAlignedBB(0.1875,0,0.1875,0.8125,0.625,0.8125);

    public static final PropertyBool PROPERTY_OPEN = PropertyBool.create("open"); // true = open, false = close
    public static final PropertyDirection PROPERTY_DIRECTION = BlockHorizontal.FACING;

    public static BlockCookieJar instance = null;

    private BlockCookieJar(){
        super(Material.GLASS);
        setHardness(0);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);


        //registry stuff
        setUnlocalizedName("cookie_jar");
        setRegistryName("cookie_jar");

    }


    public static BlockCookieJar getInstance(){
        if(instance == null){
            instance = new BlockCookieJar();
        }
        return instance;
    }


    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        return COOKIE_JAR_AABB;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state){
        return false;
    }


    //meta data stuff and state stuff
    @Override
    public IBlockState getStateFromMeta(int meta){
        if(meta == 1){//North, closed
            return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.NORTH).withProperty(PROPERTY_OPEN,Boolean.valueOf(false));
        }
        else if(meta == 2){//North, open
            return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.NORTH).withProperty(PROPERTY_OPEN,Boolean.valueOf(true));
        }
        else if(meta == 3){//South,closed
            return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.SOUTH).withProperty(PROPERTY_OPEN,Boolean.valueOf(false));
        }
        else if(meta == 4){//South, open
            return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.SOUTH).withProperty(PROPERTY_OPEN,Boolean.valueOf(true));
        }
        else if(meta == 5){//West, closed
            return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.WEST).withProperty(PROPERTY_OPEN,Boolean.valueOf(false));
        }
        else if(meta == 6){//West, open
            return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.WEST).withProperty(PROPERTY_OPEN,Boolean.valueOf(true));
        }
        else if(meta == 7){//East, closed
            return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.EAST).withProperty(PROPERTY_OPEN,Boolean.valueOf(false));
        }
        else{//East, open
            return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.EAST).withProperty(PROPERTY_OPEN,Boolean.valueOf(true));
        }
    }

    @Override
    public int getMetaFromState(IBlockState state){
        if(state.getValue(PROPERTY_DIRECTION) == EnumFacing.NORTH && (Boolean)state.getValue(PROPERTY_OPEN).booleanValue() == false){//North, no bread
            return 1;
        }
        else if(state.getValue(PROPERTY_DIRECTION) == EnumFacing.NORTH && (Boolean)state.getValue(PROPERTY_OPEN).booleanValue() == true){//North, bread
            return 2;
        }
        else if(state.getValue(PROPERTY_DIRECTION) == EnumFacing.SOUTH && (Boolean)state.getValue(PROPERTY_OPEN).booleanValue() == false){//South, no bread
            return 3;
        }
        else if(state.getValue(PROPERTY_DIRECTION) == EnumFacing.SOUTH && (Boolean)state.getValue(PROPERTY_OPEN).booleanValue() == true){//South, bread
            return 4;
        }
        else if(state.getValue(PROPERTY_DIRECTION) == EnumFacing.WEST && (Boolean)state.getValue(PROPERTY_OPEN).booleanValue() == false){//West, no bread
            return 5;
        }
        else if(state.getValue(PROPERTY_DIRECTION) == EnumFacing.WEST && (Boolean)state.getValue(PROPERTY_OPEN).booleanValue() == true){//West, bread
            return 6;
        }
        else if(state.getValue(PROPERTY_DIRECTION) == EnumFacing.EAST && (Boolean)state.getValue(PROPERTY_OPEN).booleanValue() == false){//East, no bread
            return 7;
        }
        else{//East, bread
            return 8;
        }
    }



    //this will create a new blockstate and we pass all the properties that exist
    @Override
    public BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, new IProperty[]{PROPERTY_OPEN,PROPERTY_DIRECTION});
    }

    //This is when we right click the block
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing heldItem, float side, float hitX, float hitY){
        state = state.cycleProperty(PROPERTY_OPEN);
        worldIn.setBlockState(pos,state,3);
        float f = state.getValue(PROPERTY_OPEN).booleanValue() ? 0.6F : 0.5F;//this is used for created the sound.
        worldIn.playSound(null,pos,SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS,0.3F,f);//the f is the pitch

        return true;
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
        worldIn.setBlockState(pos, state.withProperty(PROPERTY_DIRECTION, placer.getHorizontalFacing().getOpposite()).withProperty(PROPERTY_OPEN,false), 2);

    }


    //this makes the glass see through
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }



}
