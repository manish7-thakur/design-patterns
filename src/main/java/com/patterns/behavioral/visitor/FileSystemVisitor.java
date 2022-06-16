package com.patterns.behavioral.visitor;

import java.util.List;

interface FileSystemVisitor {

    String visitFileNode(FileNode fileNode);

    List<String> visitFileNode(DirectoryNode directoryNode);
}
