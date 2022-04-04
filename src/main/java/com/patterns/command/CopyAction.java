package com.patterns.command;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;

class CopyAction extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
        Transferable content = new StringSelection("Copy command executed");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(content, null);
    }
}
