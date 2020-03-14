package com.figvam.gemmod.blocks.doubleFurance;

import com.figvam.gemmod.ModDetails;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;


public class GUIDoubleFurnace extends GuiContainer {

    private static ResourceLocation guiResourceLocation;


    public GUIDoubleFurnace(ContainerDoubleFurnace containerDoubleFurnace) {
        super(containerDoubleFurnace);

        guiResourceLocation = new ResourceLocation(ModDetails.MOD_ID + ":textures/gui/double_furnace/double_furnace_gui.png");



    }



//    @Override
//    public void initGui() {
//        super.initGui();
//        //GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
//
//        //this.buttonList.add(new GuiButton( 1, (width / 2) - (WIDTH / 2), (height / 2) - (HEIGHT / 2), 100, 20, "Hello"));
//    }


//    @Override
//    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
//
//
//
//
//
//
//    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {

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
