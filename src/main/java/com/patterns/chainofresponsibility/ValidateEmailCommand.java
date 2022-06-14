package com.patterns.chainofresponsibility;

public class ValidateEmailCommand implements Command {
    @Override
    public boolean execute(Request request) {
        return request.getEmail().contains("@");
    }
}
