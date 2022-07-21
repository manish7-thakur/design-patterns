package com.patterns.behavioral.strategy.expression;

public class Add implements Operator {

    private static Operator instance;

    private Add() {
    }

    public static Operator getInstance() {
        if (instance == null) instance = new Add();
        return instance;
    }

    @Override
    public Operand operate(Operand op1, Operand op2) {
        return new Operand(op1.getVal() + op2.getVal());
    }

    @Override
    public String toString() {
        return "+";
    }
}
