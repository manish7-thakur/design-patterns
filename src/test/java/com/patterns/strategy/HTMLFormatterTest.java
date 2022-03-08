package com.patterns.strategy;

import com.patterns.composite.LineItem;
import com.patterns.composite.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HTMLFormatterTest {
    @Test
    public void formatsHeaderInBoldHTML() {
        Formatter formatter = new HTMLFormatter();
        Assertions.assertEquals("<b>WEB - INVOICE</b>", formatter.getHeader());
    }

    @Test
    public void formatsFooterInBoldHTML() {
        Formatter formatter = new HTMLFormatter();
        Assertions.assertEquals("<b>WEB - FOOTER</b>", formatter.getFooter());
    }

    @Test
    public void formatsBodyInHTMLWithPriceAndDescription() {
        Formatter formatter = new HTMLFormatter();
        LineItem disc = new Product(24.35, "Disc");
        Assertions.assertEquals("<p>Disc : 24.35</p>", formatter.getBody(disc));
    }
}
