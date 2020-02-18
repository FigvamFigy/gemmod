package com.figvam.gemmod.registries;

import com.figvam.gemmod.items.itemBlocks.cookieJar.ItemBlockCookieJar;
import com.figvam.gemmod.items.itemBlocks.ruby.ItemBlockRuby;
import com.figvam.gemmod.items.itemBlocks.ruby.ItemBlockRubyOre;
import com.figvam.gemmod.items.ruby.*;
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
        ItemRubySword.getInstance(),//Ruby Sword
        ItemRubyHoe.getInstance(),//Ruby Hoe
        ItemRubyShovel.getInstance(),//Ruby Shovel
        ItemRubyPickaxe.getInstance(),//Ruby Pickaxe
        ItemRubyHelmet.getInstance(),//Ruby Helmet
        ItemRubyChestplate.getInstance(),//RubyChestplate
        ItemRubyLeggings.getInstance(),//Ruby Leggings
        ItemRubyBoots.getInstance()//Ruby Boots
    };






}
