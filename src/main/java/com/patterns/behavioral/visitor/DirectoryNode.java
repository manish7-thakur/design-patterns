package com.patterns.behavioral.visitor;

import java.io.File;

class DirectoryNode implements FileSystemNode {
    private final File dir;

    public DirectoryNode(File dir) {
        this.dir = dir;
    }

    public File getDirectory() {
        return dir;
    }

    @Override
    public void accept(PrintVisitor visitor) {
        visitor.visitFileNode(this);
    }
}
