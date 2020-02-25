package net.moecraft.nechar;

import codechicken.nei.api.ItemFilter;
import codechicken.nei.api.ItemInfo;
import me.towdium.pinin.Keyboard;
import me.towdium.pinin.PinIn;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class NecharSearchFilter implements ItemFilter {
    protected static PinIn context = new PinIn(Keyboard.QUANPIN, false, false, false, false, false, false, true);

    protected List<String> keywords = new ArrayList<>();

    public NecharSearchFilter(String searchText) {
        for (String keyword : searchText.split("\\s+"))
            if (keyword != null && !keyword.isEmpty())
                keywords.add(keyword);
    }

    @Override
    public boolean matches(ItemStack itemStack) {
        if (keywords.isEmpty())
            return true;

        String name = ItemInfo.getSearchName(itemStack);

        for (String keyword : keywords)
            if (!context.contains(name, keyword))
                return false;

        return true;
    }
}
