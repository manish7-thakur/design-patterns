package com.patterns.structural.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ScrollPaneTest {
    @Test
    @DisplayName("adds scroll capability")
    void testScrolling() {
        TextArea mockTextArea = Mockito.mock(TextArea.class);
        Mockito.when(mockTextArea.paint()).thenReturn("Text Area with some crap");
        ScrollPane scrollPane = new ScrollPane(mockTextArea);
        Assertions.assertEquals("Added scroll pane to Text Area with some crap", scrollPane.paint());
    }
}
