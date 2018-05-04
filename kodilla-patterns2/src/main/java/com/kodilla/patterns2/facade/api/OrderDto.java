package com.kodilla.patterns2.facade.api;

import java.util.ArrayList;
import java.util.List;

public final class OrderDto {
    private final List<ItemDto> items = new ArrayList<>();
    private ItemDto item;

    public void addItem(final ItemDto itemDto) {items.add(item);}

    public List<ItemDto> getItems() {
        return items;
    }
}
