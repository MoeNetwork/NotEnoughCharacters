package net.moecraft.nechar;

import codechicken.nei.api.ItemFilter;
import codechicken.nei.api.ItemInfo;
import cpw.mods.fml.common.registry.GameRegistry;
import me.towdium.pinin.Keyboard;
import me.towdium.pinin.PinIn;
import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NecharSearchFilter implements ItemFilter {
    protected static PinIn context = new PinIn(Keyboard.QUANPIN, false, false, false, false, false, false, true);

    protected String mod = null;

    protected List<String> keywords = null;

    public NecharSearchFilter(String searchText) {
        String[] pieces = searchText.split("\\s+");

        if (pieces.length == 0)
            return;

        if (!pieces[0].isEmpty() && pieces[0].charAt(0) == '@') {
            mod = pieces[0].substring(1);
            keywords = Arrays.stream(pieces).skip(1).collect(Collectors.toList());
        } else {
            keywords = Arrays.asList(pieces);
        }
    }

    @Override
    public boolean matches(ItemStack itemStack) {
        if (mod != null && !mod.isEmpty()) {
            GameRegistry.UniqueIdentifier itemId = GameRegistry.findUniqueIdentifierFor(itemStack.getItem());

            if (itemId == null || !itemId.modId.contains(mod))
                return false;
        }

        if (keywords == null || keywords.isEmpty())
            return true;

        String name = ItemInfo.getSearchName(itemStack);

        for (String keyword : keywords)
            if (!context.contains(name, keyword))
                return false;

        return true;
    }
}
