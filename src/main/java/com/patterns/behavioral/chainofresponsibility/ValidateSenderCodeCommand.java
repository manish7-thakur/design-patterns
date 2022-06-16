package com.patterns.behavioral.chainofresponsibility;

import java.util.Set;

public class ValidateSenderCodeCommand implements Command {
    private Set<String> whiteList;
    public ValidateSenderCodeCommand(Set<String> whiteList) {
        this.whiteList = whiteList;
    }

    @Override
    public boolean execute(Request request) {
        return whiteList.contains(request.getSenderCode());
    }
}
