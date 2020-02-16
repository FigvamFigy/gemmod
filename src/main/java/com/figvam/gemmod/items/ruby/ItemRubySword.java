package com.figvam.gemmod.items.ruby;

import com.figvam.gemmod.util.ToolMaterialUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemRubySword extends ItemSword {

    private static final ToolMaterial RUBY_MATERIAL = ToolMaterialUtil.getInstance().RUBY_MATERIAL;

    private static ItemRubySword instance = null;

    private ItemRubySword(){
        super(RUBY_MATERIAL);

        setCreativeTab(CreativeTabs.COMBAT);

        //Registry stuff
        setUnlocalizedName("ruby_sword");
        setRegistryName("ruby_sword");

    }

    public static ItemRubySword getInstance(){
        if(instance == null){
            instance = new ItemRubySword();
        }
        return instance;
    }

}
