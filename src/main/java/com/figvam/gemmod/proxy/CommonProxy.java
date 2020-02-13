package com.figvam.gemmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface CommonProxy {

    //PreInit
    void preInit(FMLPreInitializationEvent event);

    //init
    void init(FMLInitializationEvent event);


    //postInit
    void postInit(FMLPostInitializationEvent event);
}
