package com.patterns.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IconViewerTest {
    @Test
    public void showsIconImage() {
        ImageProxy proxy = new ImageProxy("image");
        var viewer = new IconViewer(proxy);
        Assertions.assertNull(proxy.getImage()); // image not loaded yet
        viewer.showImage();
        Assertions.assertNotNull(proxy.getImage());
    }
}
