package com.patterns.chainofresponsibility;

import java.util.Set;

public class ValidateReceiverCodeCommand implements Command {
    private Set<String> whitelist;

    public ValidateReceiverCodeCommand(Set<String> whitelist) {
        this.whitelist = whitelist;
    }

    @Override
    public boolean execute(Request request) {
        return whitelist.contains(request.getReceiverCode());
    }
}
