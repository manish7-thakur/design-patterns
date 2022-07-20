package com.patterns.behavioral.strategy.format;

import com.patterns.structural.composite.LineItem;

public interface Formatter {
    String getHeader();

    String getFooter();

    String getBody(LineItem item);
}
