// package net.fabricmc.example.util;

// import java.util.List;

// import org.jetbrains.annotations.Nullable;

// import net.minecraft.client.gui.screen.Screen;
// import net.minecraft.client.item.TooltipContext;
// import net.minecraft.item.Item;
// import net.minecraft.item.ItemStack;
// import net.minecraft.text.LiteralText;
// import net.minecraft.text.Text;
// import net.minecraft.world.World;

// public abstract class ItemWithOptionalTooltip extends Item {

//     public static final Text TOOLTIP;

//     static {
//         TOOLTIP = new LiteralText("Hold SHIFT for info");
//     }

//     public ItemWithOptionalTooltip(Settings settings) {
//         super(settings);
//     }

//     abstract List<Text> getTooltipText();

//     @Override
//     public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
//         if (Screen.hasShiftDown()) {
//             tooltip.addAll(getTooltipText());
//         } else {
//             tooltip.add(ItemWithOptionalTooltip.TOOLTIP);
//         }
//     }
// }