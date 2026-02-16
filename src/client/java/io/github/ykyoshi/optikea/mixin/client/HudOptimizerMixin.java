package io.github.ykyoshi.optikea.mixin.client;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.DeltaTracker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class HudOptimizerMixin {
    
    @Unique
    private static int frameCounter = 0;
    
    @Unique
    private static final int RENDER_INTERVAL = 52;
    
    @Inject(method = "render", at = @At("HEAD"))
    private void onRenderHud(GuiGraphics graphics, DeltaTracker deltaTracker, CallbackInfo ci) {
        frameCounter++;
        if (frameCounter % RENDER_INTERVAL != 0) {

        }
    }
}