package com.patterns.behavioral.observer;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class InvoiceStateListenerTest {
    @Test
    public void updatesTextAreaWhenStateChanges() {
        TextArea textArea = Mockito.mock(TextArea.class);
        ChangeListener listener = new InvoiceStateListener(textArea);
        listener.stateChanged(Mockito.mock(ChangeEvent.class));
        Mockito.verify(textArea).setText("Invoice list updated");
    }
}
