package net.brammeke.lithocraft.items;

import java.util.List;
import java.util.UUID;

import com.google.common.collect.Multimap;

import dev.emi.trinkets.api.SlotAttributes;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
// import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class Papple extends TrinketItem  {
    public Papple(Settings settings) {
        super(settings);
    }

    // @Override
    // public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
    //     playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
    //     return TypedActionResult.success(playerEntity.getStackInHand(hand));
    // }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if(Screen.hasShiftDown()){
            tooltip.add(new TranslatableText("item.lithocraft.papple.tooltip"));
        } else {
            tooltip.add(new TranslatableText("lithocraft.press_shift.tooltip"));
        }
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        // +10% movement speed
        modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uuid, "guidemod:movement_speed", 0.1, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        // If the player has access to ring slots, this will give them an extra one
        SlotAttributes.addSlotModifier(modifiers, "hand/ring", uuid, 1, EntityAttributeModifier.Operation.ADDITION);
        return modifiers;
    }
}
