package net.brammeke.lithocraft.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.client.gui.screen.TitleScreen;

@Mixin(TitleScreen.class)
public class LithocraftMixin {
	// @Inject(at = @At("HEAD"), method = "init()V")
	// private void init(CallbackInfo info) {
	// 	System.out.println("This line is printed by an example mod mixin!");
	// }
}
