package com.figvam.gemmod.blocks.statue;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockStatue extends Block {


    private static final AxisAlignedBB STATUE_AABB = new AxisAlignedBB(0,0,0,1,2,1);

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
}
