package com.patterns.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleRandomTest {
    @Test
    public void generateRandomInts() {
        var generator = SingleRandom.getInstance();
        generator.setSeed(84322);
        Assertions.assertTrue(generator.nextInt() > 0);
    }
}
