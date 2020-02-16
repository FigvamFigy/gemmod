package com.figvam.gemmod.registries;

import com.figvam.gemmod.items.itemBlocks.cookieJar.ItemBlockCookieJar;
import com.figvam.gemmod.items.itemBlocks.ruby.ItemBlockRuby;
import com.figvam.gemmod.items.itemBlocks.ruby.ItemBlockRubyOre;
import com.figvam.gemmod.items.ruby.ItemRuby;
import com.figvam.gemmod.items.ruby.ItemRubyAxe;
import com.figvam.gemmod.items.ruby.ItemRubySword;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemModList {


    public static final Item[] ITEMS = {
        //Ruby
        ItemRuby.getInstance(),//Ruby
        ItemBlockRuby.getInstance(),//Block of Ruby
        ItemBlockRubyOre.getInstance(),//Ruby ore
        ItemBlockCookieJar.getInstance(),//Cookie jar
        ItemRubyAxe.getInstance(),//Ruby Axe
        ItemRubySword.getInstance()//Ruby Sword
    };






}
