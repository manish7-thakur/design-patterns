package com.patterns.strategy;

import com.patterns.composite.LineItem;
import com.patterns.composite.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TextFormatterTest {
    Formatter formatter;

    @BeforeAll
    public void setUp() {
        formatter = new TextFormatter();
    }
    @Test
    public void formatsHeaderWithSimpleText() {
        Assertions.assertEquals("TEXT - INVOICE", formatter.getHeader());
    }

    @Test
    public void formatsFooterWithSimpleText() {
        Assertions.assertEquals("TEXT - FOOTER", formatter.getFooter());
    }

    @Test
    public void formatsBodyWithPriceAndDescription() {
        LineItem disc = new Product(23.45, "Disc");
        Assertions.assertEquals("Disc : 23.45", formatter.getBody(disc));
    }
}
