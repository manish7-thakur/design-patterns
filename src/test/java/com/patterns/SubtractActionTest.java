package com.patterns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SubtractActionTest {
    @Test
    @DisplayName("performs subtraction")
    public void testSubtraction() {
        int actual = new SubtractAction().act(1, 2);
        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }
}
