package io.github.ykyoshi.optikea;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OptiKeaClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("optikea");

    @Override
    public void onInitializeClient() {
        LOGGER.info("OptiKea Initialized!");
    }
}