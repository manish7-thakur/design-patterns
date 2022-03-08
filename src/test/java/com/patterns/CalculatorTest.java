package com.patterns;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorTest {
    @Test
    @DisplayName("performs calculation")
    public void testCalculation() {
        Action actionMock = Mockito.mock(Action.class);
        Calculator c = new Calculator(actionMock);
        c.calculate(3, 4);
        Mockito.verify(actionMock).act(3, 4);
    }
}
