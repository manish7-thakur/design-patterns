package com.patterns.proxy;

import javax.swing.*;
import java.awt.*;

class ImageProxy implements Icon {
    private String name;
    private ImageIcon iconImage;

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
        this.iconImage = new ImageIcon(name);
    }

    public Object getImage() {
        return iconImage;
    }
}