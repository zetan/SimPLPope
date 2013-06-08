package syntax;

import semantics.Env;
import semantics.Type;

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
		Value conValue = condition.Eval(env);
		if(conValue.getType() != Type.BOOL) System.out.println("if type error");
		if(conValue.toString().equals("true"))
			return thenClause.Eval(env);
		else return elseClause.Eval(env);
	}
	
}