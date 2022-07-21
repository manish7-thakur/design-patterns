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
            switch (l) {
                case "+" -> {
                    while (!stack.isEmpty() && prec(l) < prec(stack.peek().toString())) list.add(stack.pop());
                    stack.push(Add.getInstance());
                }
                case "*" -> stack.push(Multiply.getInstance());
                case "/" -> stack.push(Divide.getInstance());
                case "-" -> {
                    while (!stack.isEmpty() && prec(l) < prec(stack.peek().toString())) list.add(stack.pop());
                    stack.push(Subtract.getInstance());
                }
                default -> list.add(new Operand(Integer.parseInt(l)));
            }
        }
        while (!stack.isEmpty()) list.add(stack.pop());
        return list;
    }

    private int prec(String l) {
        if (l.equals("*") || l.equals("/")) return 2;
        if (l.equals("+") || l.equals("-")) return 1;
        return 0;
    }
}
