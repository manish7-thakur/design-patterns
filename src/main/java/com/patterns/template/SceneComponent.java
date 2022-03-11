package com.patterns.template;

import java.util.ArrayList;
import java.util.List;

class SceneComponent {
    List<SceneShape> shapes;

    public SceneComponent() {
        shapes = new ArrayList<>();
    }

    public SceneComponent(List<SceneShape> shapes) {
        this.shapes = shapes;
    }

    public void add(SceneShape shape) {
        shapes.add(shape);
    }

    public List<SceneShape> getShapes() {
        return shapes;
    }

    public void paintComponents() {
        shapes.forEach(SceneShape::drawSelection);
    }
}
