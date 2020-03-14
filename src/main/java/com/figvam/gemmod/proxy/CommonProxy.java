package com.figvam.gemmod.proxy;

import com.figvam.gemmod.GemmodMain;
import com.figvam.gemmod.util.GuiHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {



    public void preInit(FMLPreInitializationEvent event){

    }

    //Init
    public void init(FMLInitializationEvent event){
        NetworkRegistry.INSTANCE.registerGuiHandler(GemmodMain.instance, new GuiHandler());
    }

    //PostInit
    public void postInit(FMLPostInitializationEvent event){

    }
}
