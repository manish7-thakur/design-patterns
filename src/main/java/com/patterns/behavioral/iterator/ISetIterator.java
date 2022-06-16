package com.patterns.behavioral.iterator;

class ISetIterator implements ICollection {
    @Override
    public IIterator iterator() {
        return () -> "Set Iterator";
    }
}
