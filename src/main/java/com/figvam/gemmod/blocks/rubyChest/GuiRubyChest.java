package com.figvam.gemmod.blocks.rubyChest;

import com.figvam.gemmod.ModDetails;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiRubyChest extends GuiContainer {

    private static ResourceLocation guiResourceLocation;


    public GuiRubyChest(InventoryPlayer player, TileEntityRubyChest tileentity){
        super(new ContainerRubyChest(player,tileentity));

        guiResourceLocation = new ResourceLocation(ModDetails.MOD_ID + ":textures/gui/ruby_chest/chest_gui.png");

    }

    @Override
    public boolean doesGuiPauseGame(){
        return false;
    }




    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

        this.drawDefaultBackground();
        mc.getTextureManager().bindTexture(guiResourceLocation);

        int middleX = (width / 2) - (xSize / 2);
        int middleY = (height / 2) - (ySize / 2);

        //xSize = 176;
        //ySize = 165;

        this.drawTexturedModalRect(middleX,middleY,0,0,this.xSize,this.ySize);
    }






}
