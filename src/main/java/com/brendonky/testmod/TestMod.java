package com.brendonky.testmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Blocks;

@Mod(
        useMetadata = true
)
public class TestMod {
    public static final String MODID = "testmod";
    public static final String VERSION = "0.1.0";

    public ExampleMod() {
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
