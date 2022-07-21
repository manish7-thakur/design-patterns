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
    public void parseToPostFixExpression() {
        Expression exp = new Expression(p.parse("2 + 3"));
        Assertions.assertEquals("23+", exp.toString());
        exp = new Expression(p.parse("2 * 3 + 5"));
        Assertions.assertEquals("23*5+", exp.toString());
        exp = new Expression(p.parse("2 / 3 + 5"));
        Assertions.assertEquals("23/5+", exp.toString());
        exp = new Expression(p.parse("2 / 3 - 5"));
        Assertions.assertEquals("23/5-", exp.toString());
        exp = new Expression(p.parse("2 * 3 / 5 - 8"));
        Assertions.assertEquals("235/*8-", exp.toString());
        exp = new Expression(p.parse("2 / 3 * 5 + 8"));
        Assertions.assertEquals("235*/8+", exp.toString());
    }
}
