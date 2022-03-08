package com.patterns.composite;

import java.util.List;
import java.util.stream.Collectors;

class Bundle implements LineItem {
    private List<LineItem> items;

    public Bundle(List<LineItem> items) {
        this.items = items;
    }

    @Override
    public double getPrice() {
        return items.stream().reduce(0d, (acc, item) -> acc + item.getPrice(), Double::sum);
    }

    @Override
    public String getDescription() {
        return items.stream().map(LineItem::getDescription).collect(Collectors.joining(", ", "Bundle: ", ""));
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void add(LineItem item) {
        items.add(item);
    }
}
