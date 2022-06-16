package com.patterns.behavioral.strategy;

import com.patterns.structural.composite.LineItem;

class TextFormatter implements Formatter {
    @Override
    public String getHeader() {
        return "TEXT - INVOICE";
    }

    @Override
    public String getBody(LineItem item) {
        return item.getDescription() + " : " + item.getPrice();
    }

    @Override
    public String getFooter() {
        return "TEXT - FOOTER";
    }
}
