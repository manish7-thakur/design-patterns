package com.patterns.chainofresponsibility;

import java.util.List;

public class MailChainExecutor {

    private final List<Command> commands;

    public MailChainExecutor(List<Command> commands) {
        this.commands = commands;
    }

    public void execute(Request request) {
        commands.forEach(command -> command.execute(request));
    }
}
