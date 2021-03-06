package com.github.ctpahhik.cq4j.operations;

import com.github.ctpahhik.cq4j.common.IOperator;

/**
 * TODO: JavaDoc
 *
 * @author Denys Mostovliuk (mostovliuk@gmail.com)
 */
public class IsNullOperator extends AbstractOperator<Boolean> {

    private IOperator valueOp;

    public IsNullOperator(IOperator valueOp) {
        this.valueOp = valueOp;
    }

    @Override
    public Boolean evaluate(Object data) {
        return valueOp.evaluate(data) == null;
    }

    @Override
    public boolean isDeterministic() {
        return valueOp.isDeterministic();
    }

    @Override
    public String toString() {
        return "IS_NULL (" + valueOp + ')';
    }
}
