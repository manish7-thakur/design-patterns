package com.patterns.behavioral.strategy.expression;


import java.util.List;
import java.util.Stack;

public class Expression {
    private List<Literal> literals;

    public Expression(List<Literal> literals) {
        this.literals = literals;
    }

    public Operand eval() {
        Stack<Operand> stack = new Stack<>();
        for(Literal l : literals) {
            if(l instanceof Operator operator) {
                Operand op2 = stack.pop();
                Operand op1 = stack.pop();
                Operand res = operator.operate(op1, op2);
                stack.push(res);
            } else stack.push((Operand) l);
        }
        return stack.pop();
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        for(Literal l : literals) {
            b.append(l.toString());
        }
        return b.toString();
    }
}
