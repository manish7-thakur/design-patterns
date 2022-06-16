package com.patterns.behavioral.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.File;

public class FileNodeTest {
    @Test
    public void fileNodeAcceptsVisitor() {
        FileNode fileNode = new FileNode(new File("papa"));
        PrintVisitor visitorMock = Mockito.mock(PrintVisitor.class);
        fileNode.accept(visitorMock);
        Mockito.verify(visitorMock).visitFileNode(fileNode);
    }
}
