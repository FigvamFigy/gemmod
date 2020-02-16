package com.figvam.gemmod.items.itemBlocks.cookieJar;

import com.figvam.gemmod.blocks.cookieJar.BlockCookieJar;
import com.figvam.gemmod.items.itemBlocks.ruby.ItemBlockRuby;
import net.minecraft.item.ItemBlock;

public class ItemBlockCookieJar extends ItemBlock {

    private static BlockCookieJar BLOCK_COOKIE_JAR = BlockCookieJar.getInstance();

    private static ItemBlockCookieJar instance = null;

    private ItemBlockCookieJar(){
        super(BLOCK_COOKIE_JAR);

        //Registry stuff
        setUnlocalizedName(BLOCK_COOKIE_JAR.getUnlocalizedName());
        setRegistryName(BLOCK_COOKIE_JAR.getRegistryName());

    }


    public static ItemBlockCookieJar getInstance(){
        if(instance == null){
            instance = new ItemBlockCookieJar();
        }
        return instance;
    }




}
