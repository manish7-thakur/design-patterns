package com.patterns.command;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;

class CopyAction extends AbstractAction {
    private final String text;

    public CopyAction(String text) {
        this.text = text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Transferable content = new StringSelection(text);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(content, null);
    }
}
