package com.figvam.gemmod.items.ruby;

import com.figvam.gemmod.util.ArmorMaterialUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRubyChestplate extends ItemArmor {

    private static final ArmorMaterial RUBY_MATERIAL = ArmorMaterialUtil.getInstance().RUBY_MATERIAL;

    private static ItemRubyChestplate instance = null;

    private ItemRubyChestplate(){
        super(RUBY_MATERIAL,10,EntityEquipmentSlot.CHEST);

        setCreativeTab(CreativeTabs.COMBAT);

        setUnlocalizedName("ruby_chestplate");
        setRegistryName("ruby_chestplate");
    }

    public static ItemRubyChestplate getInstance(){
        if(instance == null){
            instance = new ItemRubyChestplate();
        }
        return instance;
    }

}
