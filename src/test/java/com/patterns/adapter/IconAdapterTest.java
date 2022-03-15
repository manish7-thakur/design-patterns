package com.patterns.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;

import javax.swing.*;
import java.awt.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class IconAdapterTest {

    Icon iconMock;
    IconAdapter component;

    @BeforeAll
    public void setUp() {
        iconMock = Mockito.mock(Icon.class);
        component = new IconAdapter(iconMock);
    }

    @Test
    public void delegatesPaintComponentToIcon() {
        Graphics graphicsMock = Mockito.mock(Graphics.class);
        component.paintComponent(graphicsMock);
        Mockito.verify(iconMock).paintIcon(component, graphicsMock, 0, 0);
    }

    @Test
    public void getsPreferredSizeFromIcon() {
        int width = 3, height = 4;
        Mockito.when(iconMock.getIconWidth()).thenReturn(width);
        Mockito.when(iconMock.getIconHeight()).thenReturn(height);
        Dimension d = component.getPreferredSize();
        Assertions.assertEquals(width, d.width);
        Assertions.assertEquals(height, d.height);
    }
}
