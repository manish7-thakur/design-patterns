package com.patterns.behavioral.strategy.expression;

public class Subtract implements Operator {
    private static Operator instance;

    private Subtract() {

    }

    public static Operator getInstance() {
        if (instance == null) instance = new Subtract();
        return instance;
    }

    @Override
    public Operand operate(Operand op1, Operand op2) {
        return new Operand(op1.getVal() - op2.getVal());
    }

    @Override
    public String toString() {
        return "-";
    }
}
