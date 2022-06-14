package com.patterns.chainofresponsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class ValidateSenderCodeCommandTest {
    @Test
    public void validateSenderCode() {
        Command command = new ValidateSenderCodeCommand(Set.of("sender2", "sender1"));
        Assertions.assertTrue(command.execute(new Request("", "sender1", "")));
    }
}
