package com.pidanic.saral.domain.expression.logic;

import com.pidanic.saral.domain.expression.Expression;
import com.pidanic.saral.generator.ExpressionGenerator;
import com.pidanic.saral.util.TypeResolver;

public class And extends LogicExpression {
    public And(Expression left, Expression right) {
        super(LogicSign.AND, left, right);
        if(!TypeResolver.isBoolean(left.getType()) || !TypeResolver.isBoolean(right.getType())) {
            throw new UnsupportedOperationException("Only logical expression supported. Actual expression type. Left: "
                    + left.getType() + ", right: " + right.getType());
        }
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}