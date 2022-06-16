package com.patterns.behavioral.visitor;

interface FileSystemNode {
    void accept(PrintVisitor mock);
}
