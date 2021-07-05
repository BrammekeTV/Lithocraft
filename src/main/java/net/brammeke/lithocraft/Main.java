package net.brammeke.lithocraft;

import net.brammeke.lithocraft.registry.ModBlocks;
import net.brammeke.lithocraft.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

	public static final String MOD_ID = "lithocraft";
	
	//ItemGroup
	public static final ItemGroup LITHOCRAFT_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "lithocraft_items"), () -> new ItemStack(ModItems.VITREUS_SHARD));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Items
		ModItems.registerItems();
		ModBlocks.registerBlocks();

		// Transparent Blocks
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EMPTY_SPAWNER_CAGE, RenderLayer.getCutout());
	}
}
