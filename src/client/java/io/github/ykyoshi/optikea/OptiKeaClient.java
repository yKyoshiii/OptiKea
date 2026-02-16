package io.github.ykyoshi.optikea;

import io.github.ykyoshi.optikea.performance.PerformanceOverlay;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class OptikeaClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register(new PerformanceOverlay());
    }
}