package com.patterns.behavioral.command;

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
        String text = "copy this shit to clipboard";
        Action copyAction = new CopyAction(text);
        copyAction.actionPerformed(Mockito.mock(ActionEvent.class));
        Clipboard b = Toolkit.getDefaultToolkit().getSystemClipboard();
        String copied = null;
        if (b.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
            copied = (String) b.getData(DataFlavor.stringFlavor);
        }
        Assertions.assertEquals(text, copied);
    }
}
