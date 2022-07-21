package com.patterns.behavioral.strategy.expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExpressionParser {
    public List<Literal> parse(String exp) {
        String[] literals = exp.split(" ");
        Stack<Operator> stack = new Stack<>();
        List<Literal> list = new ArrayList<>(literals.length);
        for (String l : literals) {
            if ("+".equals(l)) {
                stack.push(new Add());
            } else if("*".equals(l)) {
                stack.push(new Multiply());
            } else if("/".equals(l)) {
                stack.push(new Divide());
            } else if("-".equals(l)) {
                stack.push(new Subtract());
            } else {
                list.add(new Operand(Integer.parseInt(l)));
            }
        }
        while(!stack.isEmpty()) list.add(stack.pop());
        return list;
    }
}
