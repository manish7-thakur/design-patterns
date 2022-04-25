package com.patterns.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.*;

public class ImageProxyTest {
    ImageProxy proxy;
    ImageProxy proxyMock;

    @BeforeEach
    public void setUp() {
        proxy = new ImageProxy("what's in a name");
        proxyMock = Mockito.spy(proxy);
    }

    @Test
    public void assignsName() {
        Assertions.assertEquals("what's in a name", proxy.getName());
    }

    @Test
    public void paintingIconEnsuresImageLoading() {
        proxyMock.paintIcon(Mockito.mock(Component.class), Mockito.mock(Graphics.class), 0, 1);
        Mockito.verify(proxyMock).ensureImageLoaded();
    }

    @Test
    public void accessingHeightIconEnsuresImageLoading() {
        proxyMock.getIconHeight();
        Mockito.verify(proxyMock).ensureImageLoaded();
    }

    @Test
    public void accessingWidthIconEnsuresImageLoading() {
        proxyMock.getIconWidth();
        Mockito.verify(proxyMock).ensureImageLoaded();
    }

    @Test
    public void imageLoadedBeforeUse() {
        proxy.ensureImageLoaded();
        Assertions.assertNotNull(proxy.getImage());
    }
}
