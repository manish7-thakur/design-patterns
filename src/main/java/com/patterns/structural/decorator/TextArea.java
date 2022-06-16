package com.patterns.structural.decorator;

class TextArea implements Component {
    private final int length;
    private final int breadth;

    public TextArea(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public TextArea() {
        this.length = 100;
        this.breadth = 100;
    }

    @Override
    public String paint() {
        return "Painting text area of length " + length + " breadth " + breadth;
    }
}
