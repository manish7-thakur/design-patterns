package com.patterns.decorator;

class ScrollPane implements Component {
    private final Component component;

    public ScrollPane(Component c) {
        this.component = c;
    }

    public String paint() {
        return "Added scroll pane to " + component.paint();
    }
}
