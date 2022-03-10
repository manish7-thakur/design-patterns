package com.patterns.observer;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class InvoiceStateListener implements ChangeListener {
    private TextArea textArea;

    public InvoiceStateListener(TextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        textArea.setText("Invoice list updated");
    }
}
