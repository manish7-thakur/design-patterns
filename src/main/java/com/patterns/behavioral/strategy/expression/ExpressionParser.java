package com.patterns.behavioral.strategy.expression;

import java.util.ArrayList;
import java.util.List;

public class ExpressionParser {
    public List<Literal> parse(String exp) {
        String[] literals = exp.split(" ");
        List<Literal> list = new ArrayList<>(literals.length);
        for (String l : literals) {
            if ("+".equals(l)) {
                list.add(new Add());
            } else {
                list.add(new Operand(Integer.parseInt(l)));
            }
        }
        return list;
    }
}
