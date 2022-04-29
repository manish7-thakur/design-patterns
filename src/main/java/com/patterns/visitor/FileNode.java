package com.patterns.visitor;

import java.io.File;

class FileNode {
    private final File file;

    public File getFile() {
        return file;
    }

    public FileNode(File file) {
        this.file = file;
    }
}
