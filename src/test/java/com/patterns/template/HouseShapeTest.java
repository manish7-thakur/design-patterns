package com.patterns.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HouseShapeTest {
    @Test
    @DisplayName("draws house shape by using primitive methods translate & draw")
    public void drawHouseShape() {
        SelectableShape shape = new HouseShape();
        Assertions.assertEquals("drawing house shape", shape.draw());
        Assertions.assertEquals("translating to new point", shape.translate());
    }
}
