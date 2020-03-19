package com.figvam.gemmod.blocks.rubyChest;

import com.figvam.gemmod.GemmodMain;
import com.figvam.gemmod.blocks.ruby.BlockRuby;
import com.figvam.gemmod.util.GuiReference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockRubyChest extends Block {



    private static BlockRubyChest instance = null;

    private BlockRubyChest(){
        super(Material.IRON);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        //Regitry stuff
        setUnlocalizedName("ruby_chest");
        setRegistryName("ruby_chest");

    }

    public static BlockRubyChest getInstance(){
        if(instance == null){
            instance = new BlockRubyChest();
        }
        return instance;
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote){
            playerIn.openGui(GemmodMain.instance, GuiReference.RUBY_CHEST_GUI_ID,worldIn,pos.getX(),pos.getY(),pos.getZ());

            TileEntityRubyChest tile = TileEntityRubyChest.getTileEntity(worldIn,pos);

            tile.incrementCount();
            playerIn.sendMessage(new TextComponentString("Count: " + tile.getCount()));


        }



        return true;
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
        return TileEntityRubyChest.getInstance();
    }

}
