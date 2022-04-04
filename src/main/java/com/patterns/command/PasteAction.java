package com.patterns.command;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.ActionEvent;

class PasteAction extends AbstractAction {
    private final CopyAction copyAction;
    private String text;

    public PasteAction(CopyAction copyAction) {
        this.copyAction = copyAction;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var b = Toolkit.getDefaultToolkit().getSystemClipboard();
        copyAction.actionPerformed(e);
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
