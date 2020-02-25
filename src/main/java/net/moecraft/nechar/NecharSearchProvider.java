package net.moecraft.nechar;

import codechicken.nei.SearchField;
import codechicken.nei.api.ItemFilter;

public class NecharSearchProvider implements SearchField.ISearchProvider {
    @Override
    public boolean isPrimary() {
        return false;
    }

    @Override
    public ItemFilter getFilter(String searchText) {
        return new NecharSearchFilter(searchText);
    }
}
