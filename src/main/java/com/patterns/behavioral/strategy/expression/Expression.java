package com.patterns.behavioral.strategy.expression;


import java.util.List;

public class Expression {
    private List<Literal> literals;

    public Expression(List<Literal> literals) {
        this.literals = literals;
    }

    public Operand eval() {
        Operand acc = (Operand) literals.get(0);
        for (int i = 1; i < literals.size(); i++) {
            if (literals.get(i) instanceof Operator) {
                Operator op = (Operator) literals.get(i);
                acc = op.operate(acc, (Operand) literals.get(++i));
            }
        }
        return acc;
    }

    public String asString() {
        StringBuilder b = new StringBuilder();
        for(Literal l : literals) {
            b.append(l.toString());
        }
        return b.toString();
    }
}
