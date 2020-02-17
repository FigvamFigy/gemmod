package com.figvam.gemmod.items.ruby;

import com.figvam.gemmod.util.ArmorMaterialUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRubyLeggings extends ItemArmor {

    private static final ArmorMaterial RUBY_MATERIAL = ArmorMaterialUtil.getInstance().RUBY_MATERIAL;

    private static ItemRubyLeggings instance = null;

    private ItemRubyLeggings(){
        super(RUBY_MATERIAL,10,EntityEquipmentSlot.LEGS);

        setCreativeTab(CreativeTabs.COMBAT);

        setUnlocalizedName("ruby_leggings");
        setRegistryName("ruby_leggings");
    }

    public static ItemRubyLeggings getInstance(){
        if(instance == null){
            instance = new ItemRubyLeggings();
        }
        return instance;
    }

}
