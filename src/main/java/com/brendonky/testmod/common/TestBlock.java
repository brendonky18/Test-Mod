package com.brendonky.testmod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TestBlock extends Block {
    public static final String NAME = "testBlock";
    public static final String UNLOCALIZED_NAME = "test_block";
    private static final String REGISTRY_NAME = "target_block_registry";


    public TestBlock() {
        super(Material.rock);

        this.setBlockName(UNLOCALIZED_NAME);
        this.setBlockTextureName(TestMod.MODID + ":" + NAME);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
