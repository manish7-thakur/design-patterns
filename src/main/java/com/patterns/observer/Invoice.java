package com.patterns.observer;

import com.patterns.composite.LineItem;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.ArrayList;
import java.util.List;

class Invoice {
    private List<ChangeListener> listeners; //Aggregation, aggregates listeners, not composition since listeners can exist independently
    private List<LineItem> items;

    public Invoice() {
        this.listeners = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public void addListener(ChangeListener listener) {
        listeners.add(listener);
    }

    public List<ChangeListener> getListeners() {
        return listeners;
    }

    public void addItem(LineItem item) {
        items.add(item);
        ChangeEvent event = new ChangeEvent(this);
        listeners.forEach(l -> l.stateChanged(event));
    }

    public List<LineItem> getItems() {
        return items;
    }
}
