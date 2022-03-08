package com.patterns.strategy;

import com.patterns.composite.LineItem;

public interface Formatter {
    String getHeader();

    String getFooter();

    String getBody(LineItem item);
}
