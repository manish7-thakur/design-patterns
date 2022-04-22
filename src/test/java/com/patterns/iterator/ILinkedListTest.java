package com.patterns.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ILinkedListTest {
    @Test
    public void iteratorForLinkedList() {
        IIterator iter = new ILinkedList().iterator();
        Assertions.assertEquals("LinkedList Iterator", iter.next());
    }
}
