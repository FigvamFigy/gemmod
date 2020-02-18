package com.figvam.gemmod.items.ruby;

import com.figvam.gemmod.util.ArmorMaterialUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRubyBoots extends ItemArmor {

    private static final ArmorMaterial RUBY_MATERIAL = ArmorMaterialUtil.getInstance().RUBY_MATERIAL;

    private static ItemRubyBoots instance = null;

    private ItemRubyBoots(){
        super(RUBY_MATERIAL,10,EntityEquipmentSlot.FEET);

        setCreativeTab(CreativeTabs.COMBAT);

        setUnlocalizedName("ruby_boots");
        setRegistryName("ruby_boots");
    }

    public static ItemRubyBoots getInstance(){
        if(instance == null){
            instance = new ItemRubyBoots();
        }
        return instance;
    }
}
