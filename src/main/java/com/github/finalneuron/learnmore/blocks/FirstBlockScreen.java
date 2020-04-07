package com.github.finalneuron.learnmore.blocks;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.text.ITextComponent;

public class FirstBlockScreen extends ContainerScreen<FirstBlockContainer> {

    public FirstBlockScreen(FirstBlockContainer con, PlayerInventory inv, ITextComponent comp) {
        super(con, inv, comp);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {

    }
}
