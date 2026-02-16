package io.github.ykyoshi.optikea.mixin.performance;

import io.github.ykyoshi.optikea.performance.PerformanceMonitor;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {

    @Inject(method = "tickServer", at = @At("HEAD"))
    private void optikea_startTick(CallbackInfo ci) {
        PerformanceMonitor.startTick();
    }

    @Inject(method = "tickServer", at = @At("TAIL"))
    private void optikea_endTick(CallbackInfo ci) {
        PerformanceMonitor.endTick();
    }
}
