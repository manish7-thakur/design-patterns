package com.patterns.behavioral.chainofresponsibility;

public interface Command {
    boolean execute(Request request);
}
