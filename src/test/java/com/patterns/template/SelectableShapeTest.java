package com.patterns.template;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class SelectableShapeTest {
    @Test
    @DisplayName("calls primitive operations draw & translate")
    public void callsPrimitiveOps() {
        SceneShape shape = Mockito.spy(SelectableShape.class);
        shape.drawSelection();
        InOrder inOrder = Mockito.inOrder(shape);
        inOrder.verify(shape).translate();
        inOrder.verify(shape).draw();
    }
}
