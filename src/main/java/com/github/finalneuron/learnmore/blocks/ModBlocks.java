package com.github.finalneuron.learnmore.blocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

    @ObjectHolder("learnmore:firstblock")
    public static FirstBlock FIRSTBLOCK;

    @ObjectHolder("learnmore:firstblock")
    public static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;
}
