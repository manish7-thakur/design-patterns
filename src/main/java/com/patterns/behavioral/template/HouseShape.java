package com.patterns.behavioral.template;

class HouseShape extends SelectableShape {
    @Override
    public String translate() {
        return "translating to new point";
    }

    @Override
    public String draw() {
        return "drawing house shape";
    }
}
