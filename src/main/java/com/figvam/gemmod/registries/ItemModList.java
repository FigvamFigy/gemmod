package com.figvam.gemmod.registries;

import com.figvam.gemmod.items.itemBlocks.ruby.ItemBlockRuby;
import com.figvam.gemmod.items.itemBlocks.ruby.ItemBlockRubyOre;
import com.figvam.gemmod.items.ruby.ItemRuby;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemModList {


    public static final Item[] ITEMS = {
        //Ruby
        ItemRuby.getInstance(),//Ruby
        ItemBlockRuby.getInstance(),//Block of Ruby
        ItemBlockRubyOre.getInstance()//Ruby ore

    };






}
