package com.patterns.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

interface FileSystemVisitor {

    String visitFileNode(FileNode fileNode);

    List<String> visitFileNode(DirectoryNode directoryNode);
}

class PrintVisitor implements FileSystemVisitor {
    @Override
    public String visitFileNode(FileNode fileNode) {
        return fileNode.getFile().getName();
    }

    @Override
    public List<String> visitFileNode(DirectoryNode directoryNode) {
        File[] files = directoryNode.getDirectory().listFiles();
        List<String> names = new ArrayList<>(files.length);
        for (File file : files) names.add(file.getName());
        return names;
    }
}

interface FileSystemNode {
}

class FileNode {
    private final File file;

    public File getFile() {
        return file;
    }

    public FileNode(File file) {
        this.file = file;
    }
}

class DirectoryNode {
    private final File dir;

    public DirectoryNode(File dir) {
        this.dir = dir;
    }

    public File getDirectory() {
        return dir;
    }
}

public class PrintVisitorTest {
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
