package com.patterns.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.*;

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

    @Test
    public void imageLoadedBeforeUse() {
        var proxy = new ImageProxy("image");
        proxy.ensureImageLoaded();
        Assertions.assertNotNull(proxy.getImage());
    }
}
