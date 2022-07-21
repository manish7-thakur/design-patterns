package com.patterns.behavioral.strategy.expression;

public interface Operator extends Literal {
    Operand operate(Operand op1, Operand op2);
}
