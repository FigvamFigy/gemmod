package com.figvam.gemmod.registries;


import com.figvam.gemmod.blocks.cookieJar.BlockCookieJar;
import com.figvam.gemmod.blocks.ruby.BlockRuby;
import com.figvam.gemmod.blocks.ruby.BlockRubyOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber//Used to connect to the Forge Registry thing and actually register the block
public class BlockModList {

    //Ruby

    public static final Block[] BLOCKS = {
            BlockRuby.getInstance(),//Block of Ruby
            BlockRubyOre.getInstance(),//Ruby ore
            BlockCookieJar.getInstance()//Cookie jar

    };



}
