package com.patterns.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class ValidateReceiverCodeCommandTest {
    @Test
    public void validateReceiverCode() {
        Command command = new ValidateReceiverCodeCommand(Set.of("receiver2"));
        Assertions.assertTrue(command.execute(new Request("","","receiver2")));
    }
}
