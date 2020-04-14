package com.github.finalneuron.learnmore.setup;

import com.github.finalneuron.learnmore.blocks.FirstBlockScreen;
import com.github.finalneuron.learnmore.blocks.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {


    @Override
    public void init() {
        //Client side initialization here.
        ScreenManager.registerFactory(ModBlocks.FIRSTBLOCK_CONTAINER, FirstBlockScreen::new);
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;
    }
}
