package com.patterns.behavioral.strategy.expression;

public interface Operator {
    Operand operate(Operand op1, Operand op2);
}
