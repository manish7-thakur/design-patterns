package com.patterns.chainofresponsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateEmailCommandTest {
    @Test
    public void validateEmail() {
        Command handler = new ValidateEmailCommand();
        Assertions.assertTrue(handler.execute(new Request("email@yousuck.com", "")));
    }
}
