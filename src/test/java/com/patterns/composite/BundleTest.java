package com.patterns.composite;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BundleTest {

    private LineItem bundle;
    List<LineItem> lineItems;
    Product p1;
    Product p2;

    @BeforeAll
    void setUp() {
        p1 = new Product(34.5, "cd player"); //TODO Use Builders
        p2 = new Product(23.6, "speakers");
        lineItems = List.of(p1, p2);
        bundle = new Bundle(lineItems);
    }

    @Test
    @DisplayName("Add the price of all items in the bundle")
    void testPriceAdditions() {
        double actual = bundle.getPrice();
        double expected = 58.1;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Combines the description of all items in the bundle")
    void testDescriptionCombination() {
        String actual = bundle.getDescription();
        String expected = "Bundle: cd player, speakers";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("adds the item to the bundle")
    void testItemAddition() {
        Bundle b = new Bundle(new ArrayList<>(List.of(p1)));
        LineItem anotherProduct = new Product(24.6, "VCD player");
        b.add(anotherProduct);
        Assertions.assertEquals(List.of(p1, anotherProduct), b.getItems());
    }
}
