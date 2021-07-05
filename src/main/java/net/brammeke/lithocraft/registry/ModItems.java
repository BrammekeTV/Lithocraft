package net.brammeke.lithocraft.registry;

import net.brammeke.lithocraft.Main;
import net.brammeke.lithocraft.items.Papple;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items
    public static final Papple PAPPLE = new Papple(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item VITREUS_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item AER_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item AQUA_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item FLAMMA_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item TERRA_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item ORDO_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item PERDITIO_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item CARCINODE_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item GLACIES_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item LUX_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item MOTUS_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item POTENTIA_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item CAELUM_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item INANIS_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item TOXICON_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item VITA_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item SILVA_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item ITER_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item VISCOSI_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item METALLUM_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item MORTUOS_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item CURATIO_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item TENEBRIS_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item OSTIUM_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item INCITATIO_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item ALIENUS_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item SPHAERAM_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item CARNES_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item IMMORTUOS_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item ANIMA_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item COGNITIO_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item SENSUM_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item VIR_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item ORGANUM_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item ASTUTIA_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item MACHINA_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item TELUM_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));
    public static final Item TUTELA_SHARD = new Item(new Item.Settings().group(Main.LITHOCRAFT_GROUP));


    //Block Items
    public static final BlockItem EMPTY_SPAWNER_CAGE = new BlockItem(ModBlocks.EMPTY_SPAWNER_CAGE, new Item.Settings().group(Main.LITHOCRAFT_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "papple"), PAPPLE); // Papple

        /*---------- Shards -----------*/
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "vitreus_shard"), VITREUS_SHARD); // Vitreus Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aer_shard"), AER_SHARD); // Aer Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aqua_shard"), AQUA_SHARD); // Aqua Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flamma_shard"), FLAMMA_SHARD); // Flamma Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "terra_shard"), TERRA_SHARD); // Terra Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ordo_shard"), ORDO_SHARD); // Ordo Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "perditio_shard"), PERDITIO_SHARD); // Perditio Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "carcinode_shard"), CARCINODE_SHARD); // Carcinode Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "glacies_shard"), GLACIES_SHARD); // Glacies Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lux_shard"), LUX_SHARD); // Lux Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "motus_shard"), MOTUS_SHARD); // Motus Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "potentia_shard"), POTENTIA_SHARD); // Potentia Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "caelum_shard"), CAELUM_SHARD); // Caelum Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "inanis_shard"), INANIS_SHARD); // Inanis Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "toxicon_shard"), TOXICON_SHARD); // Toxicon Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "vita_shard"), VITA_SHARD); // Vita Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "silva_shard"), SILVA_SHARD); // Silva Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "iter_shard"), ITER_SHARD); // Iter Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "viscosi_shard"), VISCOSI_SHARD); // Viscosi Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "metallum_shard"), METALLUM_SHARD); // Metallum Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mortuos_shard"), MORTUOS_SHARD); // Mortuos Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "curatio_shard"), CURATIO_SHARD); // Curatio Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "tenebris_shard"), TENEBRIS_SHARD); // Tenebris Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ostium_shard"), OSTIUM_SHARD); // Ostium Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "incitatio_shard"), INCITATIO_SHARD); // Incitatio Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "alienus_shard"), ALIENUS_SHARD); // Alienus Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sphaeram_shard"), SPHAERAM_SHARD); // Sphaeram Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "carnes_shard"), CARNES_SHARD); // Carnes Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "immortuos_shard"), IMMORTUOS_SHARD); // Immortuos Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "anima_shard"), ANIMA_SHARD); // Anima Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cognitio_shard"), COGNITIO_SHARD); // Cognitio Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sensum_shard"), SENSUM_SHARD); // Sensum Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "vir_shard"), VIR_SHARD); // Vir Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "organum_shard"), ORGANUM_SHARD); // Organum Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "astutia_shard"), ASTUTIA_SHARD); // Astutia Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "machina_shard"), MACHINA_SHARD); // Machina Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "telum_shard"), TELUM_SHARD); // Telum Shard
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "tutela_shard"), TUTELA_SHARD); // Tutela Shard

        /*---------- Blocks -----------*/
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "empty_spawner_cage"), EMPTY_SPAWNER_CAGE); // Empty Spawner Cage
    }
}
