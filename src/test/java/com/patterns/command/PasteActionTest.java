package com.patterns.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.ActionEvent;

public class PasteActionTest {
    @Test
    public void pasteItemFromTheClipBoard() {
        PasteAction pasteAction = new PasteAction(new CopyAction());
        pasteAction.actionPerformed(Mockito.mock(ActionEvent.class));
        Assertions.assertEquals("Copy command executed", pasteAction.getContent());

    }
}
