package com.patterns;

public class MultiplyAction implements Action {
    @Override
    public int act(int i, int j) {
        return i * j;
    }
}
