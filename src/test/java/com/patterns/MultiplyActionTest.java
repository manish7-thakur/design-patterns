package com.patterns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplyActionTest {
    @Test
    @DisplayName("performs multiplication")
    public void testMultiplication() {
        int actual = new MultiplyAction().act(3, 4);
        int expected = 12;
        Assertions.assertEquals(expected, actual);
    }
}
