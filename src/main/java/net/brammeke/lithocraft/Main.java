package net.brammeke.lithocraft;

import net.brammeke.lithocraft.registry.ModBlocks;
import net.brammeke.lithocraft.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class Main implements ModInitializer {

	public static final String MOD_ID = "lithocraft";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");

		// Items
		ModItems.registerItems();
		ModBlocks.registerBlocks();

		// Transparent Blocks
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EMPTY_SPAWNER_CAGE, RenderLayer.getCutout());
	}
}
