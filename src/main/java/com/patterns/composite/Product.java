package com.patterns.composite;

public class Product implements LineItem {
    private final double price;
    private final String description;

    public Product(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
