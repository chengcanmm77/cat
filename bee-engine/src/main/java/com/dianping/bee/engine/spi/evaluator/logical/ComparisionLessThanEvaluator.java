package com.dianping.bee.engine.spi.evaluator.logical;

import com.alibaba.cobar.parser.ast.expression.comparison.ComparisionLessThanExpression;
import com.dianping.bee.engine.spi.RowContext;
import com.dianping.bee.engine.spi.evaluator.AbstractEvaluator;

public class ComparisionLessThanEvaluator extends AbstractEvaluator<ComparisionLessThanExpression, Boolean> {
	public static final String ID = ComparisionLessThanExpression.class.getName();

	@Override
	public Boolean evaluate(RowContext ctx, ComparisionLessThanExpression expr) {
		Integer result = compareTo(ctx, expr.getLeftOprand(), expr.getRightOprand());

		if (result == null) {
			return null;
		} else if (result < 0) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
}
