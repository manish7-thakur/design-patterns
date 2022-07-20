package com.patterns.behavioral.strategy.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExpressionParserTest {
    @Test
    public void parseToAnOperandLiteral() {
        ExpressionParser p = new ExpressionParser();
        List<Literal> list = p.parse("1");
        Assertions.assertEquals(1, ((Operand) list.get(0)).getVal());
    }

    @Test
    public void parseToAnOperatorLiteral() {
        ExpressionParser p = new ExpressionParser();
        List<Literal> list = p.parse("+");
        Assertions.assertEquals("Add", list.get(0).getClass().getSimpleName());
    }
}
