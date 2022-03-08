package com.patterns.strategy;

import com.patterns.composite.LineItem;

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
