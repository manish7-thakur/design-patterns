package com.patterns.structural.adapter;

import javax.swing.*;
import java.awt.*;

class IconAdapter extends JComponent {

    private final Icon icon;

    public IconAdapter(Icon icon) {
        this.icon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        icon.paintIcon(this, g, 0, 0);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(icon.getIconWidth(), icon.getIconHeight());
    }
}
