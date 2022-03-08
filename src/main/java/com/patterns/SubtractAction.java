package com.patterns;

public class SubtractAction implements Action {
    @Override
    public int act(int i, int j) {
        return i - j;
    }
}
