package com.figvam.gemmod.items.ruby;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;




public class ItemRuby extends Item {

    //Instance
    private static ItemRuby instance = null;

    private ItemRuby(){
        super();
        setUnlocalizedName("ruby");
        setRegistryName("ruby");
        setCreativeTab(CreativeTabs.MATERIALS);

    }

    public static ItemRuby getInstance(){
        if(instance == null){
            instance = new ItemRuby();
        }
        return instance;
    }

}
