package com.patterns.behavioral.iterator;

class ILinkedList implements ICollection {
    @Override
    public IIterator iterator() {
        return () -> "LinkedList Iterator";
    }
}
