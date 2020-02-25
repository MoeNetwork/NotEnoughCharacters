package net.moecraft.nechar;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;

public class NEINecharConfig implements IConfigureNEI {
    @Override
    public void loadConfig() {
        API.addSearchProvider(new NecharSearchProvider());
        NotEnoughCharacters.getLogger().info("search provider added!");
    }

    @Override
    public String getName() {
        return NotEnoughCharacters.ID;
    }

    @Override
    public String getVersion() {
        return NotEnoughCharacters.VERSION;
    }
}
