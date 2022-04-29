package com.patterns.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.File;

public class DirectoryNodeTest {
    @Test
    public void directoryNodeAcceptsVisitor() {
        DirectoryNode directoryNode = new DirectoryNode(new File("."));
        PrintVisitor visitorMock = Mockito.mock(PrintVisitor.class);
        directoryNode.accept(visitorMock);
        Mockito.verify(visitorMock).visitFileNode(directoryNode);
    }
}
