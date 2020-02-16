package com.figvam.gemmod.items.ruby;

import com.figvam.gemmod.util.ToolMaterialUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;


public class ItemRubyAxe extends ItemAxe {

    private static final ToolMaterial RUBY_MATERIAL = ToolMaterialUtil.getInstance().RUBY_MATERIAL;
    private static final float TOOL_SPEED = 9.0f;

    private static ItemRubyAxe instance = null;

    private ItemRubyAxe(){
        super(RUBY_MATERIAL, RUBY_MATERIAL.getDamageVsEntity(), TOOL_SPEED);

        setCreativeTab(CreativeTabs.TOOLS);

        //Registry stuff
        setUnlocalizedName("ruby_axe");
        setRegistryName("ruby_axe");

    }


    public static ItemRubyAxe getInstance(){
        if(instance == null){
            instance = new ItemRubyAxe();
        }
        return instance;
    }


}
