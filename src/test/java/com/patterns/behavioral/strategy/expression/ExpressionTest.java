package com.patterns.behavioral.strategy.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExpressionTest {

    @Test
    public void representsExpAsString() {
        Expression exp = new Expression(List.of(new Operand(6), Add.getInstance(), new Operand(7)));
        Assertions.assertEquals("6+7", exp.toString());

        exp = new Expression(List.of(new Operand(6), new Multiply(), new Operand(7), Divide.getInstance(), new Operand(3), new Subtract(), new Operand(8)));
        Assertions.assertEquals("6*7/3-8", exp.toString());
    }

    @Test
    public void evaluatesExpressionValue() {
        Expression exp = new Expression(List.of(new Operand(4)));
        Assertions.assertEquals(4, exp.eval().getVal());

        exp = new Expression(List.of(new Operand(4), Add.getInstance(), new Operand(3)));
        Assertions.assertEquals(7, exp.eval().getVal());

//        exp = new Expression(List.of(new Operand(4), new Add(), new Operand(3), new Multiply(), new Operand(2)));
//        Assertions.assertEquals(10, exp.eval().getVal());
    }
}
