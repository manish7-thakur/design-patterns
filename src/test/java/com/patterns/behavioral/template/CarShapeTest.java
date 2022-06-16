package com.patterns.behavioral.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarShapeTest {
    @Test
    @DisplayName("draws car shape by using primitive methods translate & draw")
    public void drawCarShape() {
        SelectableShape shape = new CarShape();
        Assertions.assertEquals("drawing car shape", shape.draw());
        Assertions.assertEquals("translating to new point", shape.translate());
    }
}
