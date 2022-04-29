package com.patterns.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

public class NameVisitorTest {
    @Test
    public void visitingFileReturnsFileName() {
        FileSystemVisitor visitor = new PrintVisitor();
        Assertions.assertEquals("popo", visitor.visitFileNode(new FileNode(new File("popo"))));
    }

    @Test
    public void visitingDirectoryReturnAllFilesName() {
        FileSystemVisitor visitor = new PrintVisitor();
        Assertions.assertEquals(List.of("target", "pom.xml", "README.md", ".gitignore", ".git", ".idea", "src"), visitor.visitFileNode(new DirectoryNode(new File("."))));
    }
}
