package com.github.finalneuron.learnmore.setup;

import com.github.finalneuron.learnmore.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    private ItemGroup itemGroup = new ItemGroup("learnmore") {
        // Anonymous class to override the createIcon method. (This anonymous class is a subclass of ItemGroup, as per the syntax of anonymous methods.)
        // This version easily references ModBlocks.FIRSTBLOCK. Not sure how to incorporate multiple items though, since this class pertains to the
        // whole mod but this implementation seems to only handle one?
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.FIRSTBLOCK);
        }
    };

    public void init() {

    }
}
