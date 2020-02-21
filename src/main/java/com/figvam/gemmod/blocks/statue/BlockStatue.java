package com.figvam.gemmod.blocks.statue;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockStatue extends Block {


    private static final AxisAlignedBB STATUE_AABB = new AxisAlignedBB(0,0,0,1,2,1);
    private static PropertyDirection PROPERTY_DIRECTION = BlockHorizontal.FACING;

    private static BlockStatue instance = null;

    private BlockStatue(){
        super(Material.ROCK);

        setCreativeTab(CreativeTabs.DECORATIONS);

        setUnlocalizedName("statue");
        setRegistryName("statue");

    }

    public static BlockStatue getInstance(){
        if(instance == null){
            instance = new BlockStatue();
        }
        return instance;
    }



    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        return STATUE_AABB;
    }


    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return STATUE_AABB;
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
        switch (meta){
            case 1: return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.NORTH);
            case 2: return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.SOUTH);
            case 3: return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.WEST);
            default: return this.getDefaultState().withProperty(PROPERTY_DIRECTION,EnumFacing.EAST);
        }

    }

    @Override
    public int getMetaFromState(IBlockState state){
        EnumFacing currentFacing = state.getValue(PROPERTY_DIRECTION);

        switch(currentFacing){
            case NORTH: return 1;
            case SOUTH: return 2;
            case WEST: return 3;
            default: return 4;
        }

    }


    //this will create a new blockstate and we pass all the properties that exist
    @Override
    public BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, new IProperty[]{PROPERTY_DIRECTION});
    }

    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
        worldIn.setBlockState(pos,state.withProperty(PROPERTY_DIRECTION,placer.getHorizontalFacing().getOpposite()),2);

    }




}
