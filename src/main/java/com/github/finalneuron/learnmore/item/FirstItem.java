package com.github.finalneuron.learnmore.item;

import com.github.finalneuron.learnmore.LearnMore;
import net.minecraft.item.Item;

public class FirstItem extends Item {

    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(LearnMore.setup.itemGroup));
        setRegistryName("firstitem");
    }
}
