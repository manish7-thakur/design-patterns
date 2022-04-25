package com.patterns.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.*;
import java.awt.*;

class ImageProxy implements Icon {
    private String name;

    public ImageProxy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        ensureImageLoaded();
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }

    public void ensureImageLoaded() {
        System.out.println("");

    }
}
public class ImageProxyTest {
    @Test
    public void assignsName() {
        var proxy = new ImageProxy("what's in a name");
        Assertions.assertEquals("what's in a name", proxy.getName());
    }

    @Test
    public void paintingIconEnsuresImageLoading() {
        var proxy = new ImageProxy("name");
        ImageProxy proxyMock = Mockito.spy(proxy);
        proxyMock.paintIcon(Mockito.mock(Component.class), Mockito.mock(Graphics.class), 0, 1);
        Mockito.verify(proxyMock).ensureImageLoaded();
    }
}
