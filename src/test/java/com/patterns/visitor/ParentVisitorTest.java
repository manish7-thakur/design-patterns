package com.patterns.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class ParentVisitor implements FileSystemVisitor {
    @Override
    public String visitFileNode(FileNode fileNode) {
        return fileNode.getFile().getParent();
    }

    @Override
    public List<String> visitFileNode(DirectoryNode directoryNode) {
        File[] files = directoryNode.getDirectory().listFiles();
        List<String> names = new ArrayList<>(files.length);
        for (File file : files) names.add(file.getParent());
        return names;
    }
}

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
