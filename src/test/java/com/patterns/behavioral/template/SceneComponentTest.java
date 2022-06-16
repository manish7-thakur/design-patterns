package com.patterns.behavioral.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.List;

public class SceneComponentTest {

    SceneComponent component;

    @BeforeEach
    public void setUp() {
        component = new SceneComponent();

    }
    @Test
    public void addsShapesToSceneList() {
        SceneShape shape = new HouseShape();
        component.add(shape);
        Assertions.assertEquals(1, component.getShapes().size());
    }

    @Test
    public void usesProvidedListAsSceneList() {
        SceneShape shape = new HouseShape();
        component = new SceneComponent(List.of(shape, shape));
        Assertions.assertEquals(2, component.getShapes().size());
    }

    @Test
    public void paintsShapesToScene() {
        SceneShape houseShape = Mockito.spy(HouseShape.class);
        SceneShape carShape = Mockito.spy(CarShape.class);
        component.add(houseShape);
        component.add(carShape);
        component.paintComponents();
        InOrder inOrder = Mockito.inOrder(houseShape, carShape);
        inOrder.verify(houseShape).translate();
        inOrder.verify(houseShape).draw();
        inOrder.verify(carShape).translate();
        inOrder.verify(carShape).draw();
    }
}
