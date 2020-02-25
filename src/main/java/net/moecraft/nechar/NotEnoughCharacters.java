package net.moecraft.nechar;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = NotEnoughCharacters.ID, useMetadata = true)
public class NotEnoughCharacters {
    public static final String ID = "nechar";
    public static final String VERSION = "0.2";

    private static Logger logger;

    public static Logger getLogger() {
        return logger;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }
}
