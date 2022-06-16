package com.patterns.behavioral.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.event.ActionEvent;

public class PasteActionTest {
    @Test
    public void pasteItemFromTheClipBoard() {
        PasteAction pasteAction = new PasteAction();
        ActionEvent mockEvent = Mockito.mock(ActionEvent.class);
        String text = "this will be pasted";
        new CopyAction(text).actionPerformed(mockEvent);
        pasteAction.actionPerformed(mockEvent);
        Assertions.assertEquals(text, pasteAction.getContent());
    }
}
