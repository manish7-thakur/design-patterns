package com.patterns.behavioral.strategy.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubtractTest {
    @Test
    public void subtractsTwoOperands() {
        Operator ops = Subtract.getInstance();
        Operand operand = ops.operate(new Operand(2), new Operand(3));
        Assertions.assertEquals(-1, operand.getVal());
    }
}