package com.patterns.behavioral.template;

abstract class SelectableShape implements SceneShape {
    @Override
    public void drawSelection() {
        translate();
        draw();
    }
}
