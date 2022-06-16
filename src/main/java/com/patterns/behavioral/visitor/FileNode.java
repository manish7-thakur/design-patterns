package com.patterns.behavioral.visitor;

import java.io.File;

class FileNode implements FileSystemNode {
    private final File file;

    public File getFile() {
        return file;
    }

    public FileNode(File file) {
        this.file = file;
    }

    @Override
    public void accept(PrintVisitor visitor) {
        visitor.visitFileNode(this);
    }
}
