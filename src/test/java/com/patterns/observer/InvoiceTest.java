package com.patterns.observer;

import com.patterns.composite.LineItem;
import com.patterns.composite.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;

import javax.swing.event.ChangeListener;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class InvoiceTest {
    Invoice invoice;
    ChangeListener listener;
    LineItem item;

    @BeforeEach
    public void setUp() {
        invoice = new Invoice();
        listener = Mockito.mock(ChangeListener.class);
        item = new Product(23.4, "it's nice");
    }

    @Test
    public void addsListenersToTheList() {
        invoice.addListener(listener);
        Assertions.assertEquals(1, invoice.getListeners().size());
    }

    @Test
    public void addsItemsToTheItemsList() {
        invoice.addItem(item);
        Assertions.assertEquals(1, invoice.getItems().size());
    }

    @Test
    public void notifyListenersWhenItemAddedToList() {
        LineItem item = new Product(23.4, "it's nice");
        listener = Mockito.mock(ChangeListener.class);
        invoice.addListener(listener);
        invoice.addItem(item);
        Mockito.verify(listener).stateChanged(Mockito.any());
    }
}
