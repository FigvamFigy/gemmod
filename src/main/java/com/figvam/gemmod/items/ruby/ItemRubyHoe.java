package com.figvam.gemmod.items.ruby;

import com.figvam.gemmod.util.ToolMaterialUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemRubyHoe extends ItemHoe {

    private static final ToolMaterial RUBY_MATERIAL = ToolMaterialUtil.getInstance().RUBY_MATERIAL;

    private static ItemRubyHoe instance= null;

    private ItemRubyHoe(){
        super(RUBY_MATERIAL);

        setCreativeTab(CreativeTabs.TOOLS);

        //Registry stuff
        setUnlocalizedName("ruby_hoe");
        setRegistryName("ruby_hoe");
    }


    public static ItemRubyHoe getInstance(){
        if(instance == null){
            instance = new ItemRubyHoe();
        }
        return instance;
    }

}
