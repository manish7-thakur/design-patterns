package com.patterns.visitor;

interface FileSystemNode {
    void accept(PrintVisitor mock);
}
