package com.patterns;

public class Calculator {
    private final Action action;

    public Calculator(Action action) {
        this.action = action;
    }

    public int calculate(int i, int j) {
        return action.act(i, j);
    }
}
