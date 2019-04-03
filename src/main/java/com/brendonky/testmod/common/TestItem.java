package com.brendonky.testmod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestItem extends Item {
    public static final String NAME = "testItem";
    public static final String UNLOCALIZED_NAME = "test_item";
    private static final String REGISTRY_NAME = "test_item_registry";

    public TestItem() {
        //super();

        this.setUnlocalizedName(UNLOCALIZED_NAME);
        this.setTextureName(TestMod.MODID + ":" + NAME);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
}
