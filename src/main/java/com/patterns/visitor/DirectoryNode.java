package com.patterns.visitor;

import java.io.File;

class DirectoryNode {
    private final File dir;

    public DirectoryNode(File dir) {
        this.dir = dir;
    }

    public File getDirectory() {
        return dir;
    }
}
