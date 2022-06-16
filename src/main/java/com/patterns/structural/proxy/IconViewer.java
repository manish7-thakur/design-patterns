package com.patterns.structural.proxy;

import javax.swing.*;

class IconViewer {
    private final Icon icon;

    public IconViewer(Icon icon) {
        this.icon = icon;
    }

    public void showImage() {
        new JLabel().setSize(icon.getIconWidth(), icon.getIconHeight());
    }
}
