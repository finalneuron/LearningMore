package com.github.finalneuron.learnmore.setup;

import net.minecraft.world.World;

public interface IProxy {

    void init();
    World getClientWorld();
}
