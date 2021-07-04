package net.brammeke.lithocraft.registry;

import net.brammeke.lithocraft.Main;
import net.brammeke.lithocraft.items.Papple;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items
    public static final Papple PAPPLE = new Papple(new Item.Settings().group(ItemGroup.MISC));
    public static final Item VITREUS_SHARD = new Item(new Item.Settings().group(ItemGroup.MISC));

    //Block Items
    public static final BlockItem EMPTY_SPAWNER_CAGE = new BlockItem(ModBlocks.EMPTY_SPAWNER_CAGE, new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "papple"), PAPPLE); // Papple
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "vitreus_shard"), VITREUS_SHARD); // Vitreus Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "empty_spawner_cage"), EMPTY_SPAWNER_CAGE); // Empty Spawner Cage
    }
}
