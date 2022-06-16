package com.patterns.behavioral.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ISetIteratorTest {
    @Test
    public void iteratorForSet() {
        IIterator iter = new ISetIterator().iterator();
        Assertions.assertEquals("Set Iterator", iter.next());
    }
}
