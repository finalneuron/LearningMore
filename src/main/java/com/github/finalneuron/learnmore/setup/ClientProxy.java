package com.github.finalneuron.learnmore.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {


    @Override
    public void init() {
        //Client side initialization here.
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
