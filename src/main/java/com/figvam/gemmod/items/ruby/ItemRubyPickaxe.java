package com.figvam.gemmod.items.ruby;

import com.figvam.gemmod.util.ToolMaterialUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemRubyPickaxe extends ItemPickaxe {

    private static final ToolMaterial RUBY_MATERIAL = ToolMaterialUtil.getInstance().RUBY_MATERIAL;

    private static ItemRubyPickaxe instance = null;

    private ItemRubyPickaxe(){
        super(RUBY_MATERIAL);

        setCreativeTab(CreativeTabs.COMBAT);

        //Registry stuff
        setUnlocalizedName("ruby_pickaxe");
        setRegistryName("ruby_pickaxe");

    }

    public static ItemRubyPickaxe getInstance(){
        if(instance == null){
            instance = new ItemRubyPickaxe();
        }
        return instance;
    }

}
