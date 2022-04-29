package com.patterns.visitor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
