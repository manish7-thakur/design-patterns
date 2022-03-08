package com.patterns.decorator;

import com.patterns.composite.LineItem;

class DiscountedItem implements LineItem {
    private final LineItem item;
    private final double discount;

    public DiscountedItem(LineItem item, double discount) {
        this.item = item;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return item.getPrice() - (item.getPrice() * discount / 100);
    }

    @Override
    public String getDescription() {
        return "Item with " + discount + "% discount";
    }
}
