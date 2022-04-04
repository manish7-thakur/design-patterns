package com.patterns.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class CopyActionTest {
    @Test
    public void copiesTextToClipBoard() throws IOException, UnsupportedFlavorException {
        Action copyAction = new CopyAction();
        copyAction.actionPerformed(Mockito.mock(ActionEvent.class));
        Clipboard b = Toolkit.getDefaultToolkit().getSystemClipboard();
        String text = null;
        if (b.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
            text = (String) b.getData(DataFlavor.stringFlavor);
        }
        Assertions.assertEquals("Copy command executed", text);
    }
}
