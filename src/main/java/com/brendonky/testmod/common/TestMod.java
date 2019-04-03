package com.brendonky.testmod.common;

import cpw.mods.fml.common.registry.GameRegistry;
//import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = "testmod", useMetadata = true)
public class TestMod {
    //private static Logger logger;

    public static final String MODID = "testmod";
    public static final String VERSION = "0.1.0";

    private static Block testBlock;
    private static Item testItem;

    public TestMod() {
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        //logger.info("Mod initialized: test mod");
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());

        testBlock = new TestBlock();
        GameRegistry.registerBlock(testBlock, TestBlock.NAME);

        testItem = new TestItem();
        GameRegistry.registerItem(testItem, TestItem.NAME);

    }
}
