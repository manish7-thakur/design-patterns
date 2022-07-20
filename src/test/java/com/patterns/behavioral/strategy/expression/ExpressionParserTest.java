package com.patterns.behavioral.strategy.expression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ExpressionParserTest {
    private ExpressionParser p;

    @BeforeAll
    public void setUp() {
        p = new ExpressionParser();
    }

    @Test
    public void parseToAnOperandLiteral() {
        List<Literal> list = p.parse("1");
        Assertions.assertEquals(1, ((Operand) list.get(0)).getVal());
    }

    @Test
    public void parseToAnOperatorLiteral() {
        List<Literal> list = p.parse("+");
        Assertions.assertEquals("Add", list.get(0).getClass().getSimpleName());
        list = p.parse("*");
        Assertions.assertEquals("Multiply", list.get(0).getClass().getSimpleName());
        list = p.parse("/");
        Assertions.assertEquals("Divide", list.get(0).getClass().getSimpleName());
        list = p.parse("-");
        Assertions.assertEquals("Subtract", list.get(0).getClass().getSimpleName());
    }

    @Test
    public void parseToAllLiteral() {
        List<Literal> list = p.parse("2 + 3");
        Assertions.assertEquals(2, ((Operand) list.get(0)).getVal());
        Assertions.assertEquals("Add", list.get(1).getClass().getSimpleName());
        Assertions.assertEquals(3, ((Operand) list.get(2)).getVal());
    }
}
