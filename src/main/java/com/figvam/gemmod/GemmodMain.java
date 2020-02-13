package com.figvam.gemmod;


import com.figvam.gemmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ModDetails.MOD_ID, name = ModDetails.MOD_NAME, version = ModDetails.MOD_VERSION)
public class GemmodMain {

    //This shows up everywhere. I guess tehre can only be one instance allowed to speak with FML
    @Mod.Instance(ModDetails.MOD_ID)
    public static GemmodMain instance;

    //This is needed to tell FML where our proxys are
    @SidedProxy(clientSide = ModDetails.CLIENT_PROXY_CLASS, serverSide = ModDetails.SERVER_PROXY_CLASS)
    public static CommonProxy commonProxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        commonProxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
