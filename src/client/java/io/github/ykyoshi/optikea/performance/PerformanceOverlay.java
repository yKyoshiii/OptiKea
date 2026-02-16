package io.github.ykyoshi.optikea.performance;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

public class PerformanceOverlay implements HudRenderCallback {

    private long lastUpdate = 0;
    private String fpsText = "";
    private String memText = "";

    @Override
    public void onHudRender(GuiGraphics graphics, net.minecraft.client.DeltaTracker deltaTracker) {

        Minecraft mc = Minecraft.getInstance();

        if (mc.player == null || mc.level == null) return;

        long now = System.currentTimeMillis();

        // Atualiza só a cada 500ms (OTIMIZAÇÃO REAL)
        if (now - lastUpdate > 500) {

            fpsText = "FPS: " + mc.getFps();

            memText = "RAM: " +
                    ((Runtime.getRuntime().totalMemory() -
                    Runtime.getRuntime().freeMemory()) / 1024 / 1024)
                    + "MB";

            lastUpdate = now;
        }

        graphics.drawString(mc.font, fpsText, 5, 5, 0xFFFFFF);
        graphics.drawString(mc.font, memText, 5, 15, 0xAAAAAA);
    }
}
