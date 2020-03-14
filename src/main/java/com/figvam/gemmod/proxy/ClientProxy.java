package com.figvam.gemmod.proxy;

import com.figvam.gemmod.GemmodMain;
import com.figvam.gemmod.registries.ItemModList;
import com.figvam.gemmod.util.GuiHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy{

    //PreInit
    @Override
    public void preInit(FMLPreInitializationEvent event){

    }

    //Init
    @Override
    public void init(FMLInitializationEvent event){
        super.init(event);
        //NetworkRegistry.INSTANCE.registerGuiHandler(GemmodMain.instance, new GuiHandler());
    }

    //PostInit
    @Override
    public void postInit(FMLPostInitializationEvent event){

    }
}
