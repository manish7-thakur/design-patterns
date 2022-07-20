package com.patterns.behavioral.strategy.expression;

public class Operand implements Literal {
    private int val;

    public Operand(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
