package com.patterns.chainofresponsibility;

public interface Command {
    boolean execute(Request request);
}
