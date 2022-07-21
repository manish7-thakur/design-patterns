package com.patterns.behavioral.strategy.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivideTest {
    @Test
    public void dividesTwoOperands() {
        Operator ops = Divide.getInstance();
        Operand opd = ops.operate(new Operand(2), new Operand(2));
        Assertions.assertEquals(1, opd.getVal());
    }
}