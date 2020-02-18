package com.figvam.gemmod.util;

import com.figvam.gemmod.ModDetails;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterialUtil {
    public static final ItemArmor.ArmorMaterial RUBY_MATERIAL = EnumHelper.addArmorMaterial("ruby",ModDetails.MOD_ID + ":ruby",16,
            new int[] {4,7,6,4},10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,1F);

    private static ArmorMaterialUtil instance = null;

    private ArmorMaterialUtil(){

    }


    public static ArmorMaterialUtil getInstance(){
        if(instance == null){
            instance = new ArmorMaterialUtil();
        }
        return instance;
    }
}
