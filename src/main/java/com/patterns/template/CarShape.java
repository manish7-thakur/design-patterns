package com.patterns.template;

class CarShape extends SelectableShape {
    @Override
    public String translate() {
        return "translating to new point";
    }

    @Override
    public String draw() {
        return "drawing car shape";
    }
}
