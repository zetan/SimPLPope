package syntax;

import semantics.Env;

public class IfThenElse extends Expression{
	Expression condition;
	Expression thenClause;
	Expression elseClause;
	
	public String toString(){
		return "if " + condition.toString() + " then " + thenClause.toString() + " else " + elseClause.toString();
	}

	public IfThenElse(Expression condition, Expression thenClause,
			Expression elseClause) {
		super();
		this.condition = condition;
		this.thenClause = thenClause;
		this.elseClause = elseClause;
	}
	
	public Value Eval(Env env)
	{
		Value value = null;
		try {
			if( condition.Eval(env).toString() == "true")
			{
				return thenClause.Eval(env);
			}
		/*	else if(Integer.parseInt(condition.Eval().toString()) > 0)
			{
				return thenClause.Eval();
			}
			else
			{
				return elseClause.Eval();
			}*/
			else{
				return elseClause.Eval(env);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("type error");
		}
		return value;
	}
	
}