package com.figvam.gemmod.items.ruby;

import com.figvam.gemmod.util.ArmorMaterialUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRubyHelmet extends ItemArmor {

    private static final ArmorMaterial RUBY_MATERIAL = ArmorMaterialUtil.getInstance().RUBY_MATERIAL;

    private static ItemRubyHelmet instance = null;

    private ItemRubyHelmet(){
        super(RUBY_MATERIAL,10,EntityEquipmentSlot.HEAD);

        setCreativeTab(CreativeTabs.COMBAT);

        setUnlocalizedName("ruby_helmet");
        setRegistryName("ruby_helmet");
    }

    public static ItemRubyHelmet getInstance(){
        if(instance == null){
            instance = new ItemRubyHelmet();
        }
        return instance;
    }


}
