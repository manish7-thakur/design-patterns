package com.patterns.behavioral.strategy.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExpressionTest {

    @Test
    public void representsExpAsString() {
        Expression exp = new Expression(List.of(new Operand(6), Add.getInstance(), new Operand(7)));
        Assertions.assertEquals("6+7", exp.toString());

        exp = new Expression(List.of(new Operand(6), Multiply.getInstance(), new Operand(7), Divide.getInstance(), new Operand(3), Subtract.getInstance(), new Operand(8)));
        Assertions.assertEquals("6*7/3-8", exp.toString());
    }

    @Test
    public void evaluatesExpressionValue() {
        ExpressionParser parse = new ExpressionParser();
        Expression exp = new Expression(parse.parse("2 + 4"));
        Assertions.assertEquals(6, exp.eval().getVal());

        exp = new Expression(parse.parse("2 * 3 + 5"));
        Assertions.assertEquals(11, exp.eval().getVal());

        exp = new Expression(parse.parse("2 / 3 + 5"));
        Assertions.assertEquals(5, exp.eval().getVal());

        exp = new Expression(parse.parse("2 * 3 / 5 - 8"));
        Assertions.assertEquals(-8, exp.eval().getVal());

        exp = new Expression(parse.parse("2 / 3 * 5 + 8 + 3 - 4"));
        Assertions.assertEquals(7, exp.eval().getVal());
    }
}
