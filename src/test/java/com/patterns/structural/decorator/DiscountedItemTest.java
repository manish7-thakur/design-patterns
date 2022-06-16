package com.patterns.structural.decorator;

import com.patterns.structural.composite.LineItem;
import com.patterns.structural.composite.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DiscountedItemTest {
    LineItem p;
    LineItem discountedItem;

    @BeforeAll
    public void setUp() {
        p = new Product(80, "it's discounted baby");
        discountedItem = new DiscountedItem(p, 20);
    }

    @Test
    public void applyDiscountToItemPrice() {
        Assertions.assertEquals(64, discountedItem.getPrice());
    }

    @Test
    public void descriptionMentionsDiscount() {
        Assertions.assertEquals("Item with 20.0% discount", discountedItem.getDescription());
    }
}
