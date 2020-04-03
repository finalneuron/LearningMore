package com.github.finalneuron.learnmore.blocks;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class FirstBlockTile extends TileEntity implements ITickableTileEntity {

    public FirstBlockTile() {
        super(ModBlocks.FIRSTBLOCK_TILE);
    }


    @Override
    public void tick() {
        if (world.isRemote) {
            System.out.println("FirstBlockTile.tick");
        }
    }
}
