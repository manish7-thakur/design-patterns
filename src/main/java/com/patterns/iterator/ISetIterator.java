package com.patterns.iterator;

class ISetIterator implements ICollection {
    @Override
    public IIterator iterator() {
        return () -> "Set Iterator";
    }
}
