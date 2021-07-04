package net.brammeke.lithocraft.registry;

import net.brammeke.lithocraft.Main;
import net.brammeke.lithocraft.blocks.EmptySpawnerCage;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    //Empty Spawner Cage
    public static final EmptySpawnerCage EMPTY_SPAWNER_CAGE = new EmptySpawnerCage(FabricBlockSettings
        .of(Material.METAL)
        .breakByTool(FabricToolTags.PICKAXES, 2)
        .requiresTool()
        .strength(1.0f, 1.0f)
        .sounds(BlockSoundGroup.METAL)
        .nonOpaque()
        );

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "empty_spawner_cage"), EMPTY_SPAWNER_CAGE);
    }
}
