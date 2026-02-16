package io.github.ykyoshi.optikea.performance;

public class PerformanceMonitor {

    private static long lastTickTime = System.nanoTime();
    private static double tickTimeMs = 0;

    private static int entityCount = 0;
    private static int chunkCount = 0;

    public static void startTick() {
        lastTickTime = System.nanoTime();
    }

    public static void endTick() {
        long now = System.nanoTime();
        tickTimeMs = (now - lastTickTime) / 1_000_000.0;
    }

    public static double getTickTime() {
        return tickTimeMs;
    }

    public static void setEntityCount(int count) {
        entityCount = count;
    }

    public static void setChunkCount(int count) {
        chunkCount = count;
    }

    public static int getEntityCount() {
        return entityCount;
    }

    public static int getChunkCount() {
        return chunkCount;
    }
}
