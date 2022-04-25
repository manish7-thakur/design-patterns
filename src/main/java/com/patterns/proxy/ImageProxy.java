package com.patterns.proxy;

import javax.swing.*;
import java.awt.*;

class ImageProxy implements Icon {
    private String name;
    private ImageIcon iconImage; //Aggregation

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
        ensureImageLoaded();
        return iconImage.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        ensureImageLoaded();
        return iconImage.getIconHeight();
    }

    public void ensureImageLoaded() {
        this.iconImage = new ImageIcon(name);
    }

    public Object getImage() {
        return iconImage;
    }
}
