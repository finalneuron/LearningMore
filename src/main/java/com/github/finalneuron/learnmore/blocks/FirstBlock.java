package com.github.finalneuron.learnmore.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FirstBlock extends Block {
    public FirstBlock() {
        super(Properties.create(Material.IRON)
        .sound(SoundType.METAL)
        .lightValue(14)
        );
        setRegistryName("firstblock");
    }
}
