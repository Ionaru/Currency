package com.ionaru.currency.common;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

import static net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL;

public class ConfigurationLoader {

    private static Configuration config = null;
    public static boolean enableAllRecipes;
    public static boolean enableToolTips;

    ConfigurationLoader(FMLPreInitializationEvent event) {
        config = new Configuration(event.getSuggestedConfigurationFile());
        syncConfig();
    }

    private void syncConfig() {
        try {
            config.load();
            enableAllRecipes = config.get(CATEGORY_GENERAL,      // Category
                    "enableAllRecipes",                          // Property name
                    "true",                                      // Default value
                    "Whether recipes are enabled, default: true" // Comment
            ).getBoolean();
            enableToolTips = config.get(CATEGORY_GENERAL,      // Category
                    "enableAllTooltips",                          // Property name
                    "true",                                      // Default value
                    "Whether tooltips are enabled, default: true" // Comment
            ).getBoolean();
        } catch (Exception e) {
            // Failed reading/writing, just continue
        } finally {
            if (config.hasChanged()) config.save();
        }
    }
}
