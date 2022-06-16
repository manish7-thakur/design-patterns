package com.patterns.structural.adapter;

import javax.swing.*;
import java.awt.*;

class IconDisplayFrame {

    private Frame frame;

    public IconDisplayFrame(Frame frame) {
        this.frame = frame;
    }

    public void addComponent(JComponent component) {
        frame.add(component);
    }
}
