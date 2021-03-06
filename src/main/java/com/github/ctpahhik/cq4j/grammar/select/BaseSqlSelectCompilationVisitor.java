// Generated from BaseSql.g4 by ANTLR 4.1
package com.github.ctpahhik.cq4j.grammar.select;
import com.github.ctpahhik.cq4j.grammar.BaseSqlAbstractVisitor;
import com.github.ctpahhik.cq4j.grammar.from.FromElements;
import com.github.ctpahhik.cq4j.grammar.generated.BaseSqlParser;
import com.github.ctpahhik.cq4j.grammar.generated.BaseSqlVisitor;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * This class provides an empty implementation of {@link com.github.ctpahhik.cq4j.grammar.generated.BaseSqlVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class BaseSqlSelectCompilationVisitor extends BaseSqlAbstractVisitor<SelectElements> implements BaseSqlVisitor<SelectElements> {

    public BaseSqlSelectCompilationVisitor(FromElements from) {
    }

    @Override
    public SelectElements visitSelectExpression(@NotNull BaseSqlParser.SelectExpressionContext ctx) {
        return new SelectElements(ctx.getText());
    }
}