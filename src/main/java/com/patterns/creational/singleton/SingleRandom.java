package com.patterns.creational.singleton;

import java.util.Random;

public class SingleRandom {
    private static SingleRandom instance = new SingleRandom();
    private Random generator;

    private SingleRandom() {
        generator = new Random();
    }

    public static SingleRandom getInstance() {
        return instance;
    }

    public int nextInt() {
        return generator.nextInt();
    }

    public void setSeed(long seed) {
        generator.setSeed(seed);
    }
}
