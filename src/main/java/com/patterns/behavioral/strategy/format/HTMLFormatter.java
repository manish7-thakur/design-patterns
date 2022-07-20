package com.patterns.behavioral.strategy.format;

import com.patterns.structural.composite.LineItem;

class HTMLFormatter implements Formatter {
    @Override
    public String getHeader() {
        return "<b>WEB - INVOICE</b>";
    }

    @Override
    public String getFooter() {
        return "<b>WEB - FOOTER</b>";
    }

    @Override
    public String getBody(LineItem item) {
        return "<p>" + item.getDescription() + " : " + item.getPrice() + "</p>";
    }
}
