package com.patterns.chainofresponsibility;

import java.util.List;

public class MailChainExecutor implements Command {

    private final List<Command> commands;

    public MailChainExecutor(List<Command> commands) {
        this.commands = commands;
    }

    public boolean execute(Request request) {
        commands.forEach(command -> command.execute(request));
        return false;
    }
}
