package com.patterns.behavioral.strategy.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplyTest {
    @Test
    public void multipliesTwoOperands() {
        Operator ops = new Multiply();
        Operand opd = ops.operate(new Operand(2), new Operand(3));
        Assertions.assertEquals(6, opd.getVal());
    }
}