package com.figvam.gemmod.registries;


import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class RegistryEventHandler {


    //BLOCK REGISTER  Registers the block to the game
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.registerAll(BlockModList.BLOCKS);


    }


    //ITEM REGISTER Registers the item into the game
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
        //To make the lines shorter
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.registerAll(ItemModList.ITEMS);


    }


    //Registers the models into the game
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){

        for(Block block: BlockModList.BLOCKS){
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),0,
                    new ModelResourceLocation(Item.getItemFromBlock(block).getRegistryName(),"inventory"));

        }

        for(Item item: ItemModList.ITEMS){
            ModelLoader.setCustomModelResourceLocation(item,0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
        }


    }







}
