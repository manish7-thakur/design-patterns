package com.patterns;

public class AddAction implements Action {
    @Override
    public int act(int i, int j) {
        return i  + j;
    }
}
