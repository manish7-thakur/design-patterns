package com.patterns.template;

abstract class SelectableShape implements SceneShape {
    @Override
    public void drawSelection() {
        translate();
        draw();
    }
}
