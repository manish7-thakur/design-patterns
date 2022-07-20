package com.patterns.behavioral.strategy.expression;

public class Add implements Literal, Operator {

    @Override
    public Operand operate(Operand op1, Operand op2) {
        return new Operand(op1.getVal() + op2.getVal());
    }
}
