package com.figvam.gemmod.util;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterialUtil {


    public static final Item.ToolMaterial RUBY_MATERIAL = EnumHelper.addToolMaterial("RUBY",3,1700,9.0f,3.5f,13);//Ruby


    private static ToolMaterialUtil instance = null;

    private ToolMaterialUtil(){

    }


    public static ToolMaterialUtil getInstance(){
        if(instance == null){
            instance = new ToolMaterialUtil();
        }
        return instance;
    }


}
