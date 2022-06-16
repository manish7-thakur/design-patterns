package com.patterns.structural.adapter;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.*;

public class IconDisplayFrameTest {
    @Test
    public void addsAnIconToTheFrom() {
        JFrame jFrameMock = Mockito.mock(JFrame.class);
        IconDisplayFrame f = new IconDisplayFrame(jFrameMock);
        JComponent component = new IconAdapter(Mockito.mock(Icon.class));
        f.addComponent(component);
        Mockito.verify(jFrameMock).add(component);
    }
}
