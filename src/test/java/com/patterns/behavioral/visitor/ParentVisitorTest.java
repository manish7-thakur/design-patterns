package com.patterns.behavioral.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

public class ParentVisitorTest {
    @Test
    public void visitingFileReturnsItsParent() {
        FileSystemVisitor visitor = new ParentVisitor();
        Assertions.assertEquals("papa", visitor.visitFileNode(new FileNode(new File("papa/child"))));
    }

    @Test
    public void visitingDirectoryReturnsAllParents() {
        FileSystemVisitor visitor = new ParentVisitor();
        Assertions.assertEquals(List.of(".", ".", ".", ".", ".", ".", "."), visitor.visitFileNode(new DirectoryNode(new File("."))));
    }
}
