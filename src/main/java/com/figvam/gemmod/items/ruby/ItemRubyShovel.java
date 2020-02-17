package com.figvam.gemmod.items.ruby;

import com.figvam.gemmod.util.ToolMaterialUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemRubyShovel extends ItemSpade {

    private static final ToolMaterial RUBY_MATERIAL = ToolMaterialUtil.getInstance().RUBY_MATERIAL;

    private static ItemRubyShovel instance = null;

    private ItemRubyShovel(){
        super(RUBY_MATERIAL);

        setCreativeTab(CreativeTabs.COMBAT);

        //Registry stuff
        setUnlocalizedName("ruby_shovel");
        setRegistryName("ruby_shovel");

    }

    public static ItemRubyShovel getInstance(){
        if(instance == null){
            instance = new ItemRubyShovel();
        }
        return instance;
    }

}
