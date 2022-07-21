package com.patterns.behavioral.strategy.expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {
    @Test
    public void addsTwoOperands() {
        Operator ops = Add.getInstance();
        Operand opd = ops.operate(new Operand(5), new Operand(3));
        assertEquals(8, opd.getVal());
    }
}