package com.patterns.structural.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TextAreaTest {

    @Test
    @DisplayName("use default length & breadth")
    void testPaintComponentDefaultSize() {
        TextArea textArea = new TextArea();
        String actual = textArea.paint();
        String expected = "Painting text area of length 100 breadth 100";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("use the provided length & Breadth")
    void testPaintComponentWithSize() {
        int length = 150;
        int breadth = 235;
        TextArea textArea = new TextArea(length, breadth);
        String actual = textArea.paint();
        String expected = "Painting text area of length " + length + " breadth " + breadth;
        Assertions.assertEquals(expected, actual);
    }

}
