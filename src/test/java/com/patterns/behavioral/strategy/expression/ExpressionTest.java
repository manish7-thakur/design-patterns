package com.patterns.behavioral.strategy.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExpressionTest {
    @Test
    public void evaluatesExpressionValue() {
        Expression exp = new Expression(List.of(new Operand(4)));
        Assertions.assertEquals(4, exp.eval().getVal());

        exp = new Expression(List.of(new Operand(4), new Add(), new Operand(3)));
        Assertions.assertEquals(7, exp.eval().getVal());

//        exp = new Expression(List.of(new Operand(4), new Add(), new Operand(3), new Multiply(), new Operand(2)));
//        Assertions.assertEquals(10, exp.eval().getVal());
    }
}
