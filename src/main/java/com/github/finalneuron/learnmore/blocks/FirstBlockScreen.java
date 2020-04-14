package com.github.finalneuron.learnmore.blocks;

import com.github.finalneuron.learnmore.LearnMore;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class FirstBlockScreen extends ContainerScreen<FirstBlockContainer> {

    private ResourceLocation GUI = new ResourceLocation(LearnMore.MODID, "textures/gui/firstblock_gui.png");

    public FirstBlockScreen(FirstBlockContainer con, PlayerInventory inv, ITextComponent comp) {
        super(con, inv, comp);
    }

    @Override
    public void render(int mouseX, int mouseY, float ticks) {
        //"Darkened" semi-transparent layer behind GUIs
        this.renderBackground();
        //Renders screen
        super.render(mouseX, mouseY, ticks);
        //Renders tooltips, and proper place to add custom tooltips
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
    }

    /**
     * Draws the background layer of this container (behind the items).
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(GUI);
        int relX = (this.width - this.xSize) / 2;
        int relY = (this.height - this.ySize) / 2;
        this.blit(relX, relY, 0, 0, this.xSize, this.ySize);
    }
}
