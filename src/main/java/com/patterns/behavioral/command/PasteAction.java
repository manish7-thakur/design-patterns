package com.patterns.behavioral.command;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.ActionEvent;

class PasteAction extends AbstractAction {
    private String text;

    @Override
    public void actionPerformed(ActionEvent e) {
        var b = Toolkit.getDefaultToolkit().getSystemClipboard();
        if (b.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
            try {
                text = (String) b.getData(DataFlavor.stringFlavor);
            } catch (Exception ignored) {
            }
        }

    }

    public String getContent() {
        return text;
    }
}
