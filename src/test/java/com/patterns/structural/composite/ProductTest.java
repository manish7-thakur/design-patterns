package com.patterns.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    void testProductConstructor() {
        LineItem p = new Product(23.4, "cd player");
        assertEquals(23.4, p.getPrice());
        assertEquals("cd player", p.getDescription());
    }
}
