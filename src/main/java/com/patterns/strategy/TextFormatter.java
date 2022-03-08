package com.patterns.strategy;

import com.patterns.composite.LineItem;

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
