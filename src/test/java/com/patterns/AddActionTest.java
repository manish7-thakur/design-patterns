package com.patterns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddActionTest {
    @Test
    @DisplayName("performs addition")
    public void testAdd() {
        int actual = new AddAction().act(1, 2);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}
