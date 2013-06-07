package syntax;

import semantics.Env;

public class WhileDoEnd extends Expression{
	Expression condition;
	Expression body;
	
	public WhileDoEnd(Expression condition, Expression body) {
		super();
		this.condition = condition;
		this.body = body;
	}

	public String toString(){
		return "while " + condition.toString() + " do " + body.toString() + " end";
	}
	public Value Eval(Env env)
	{
		while( condition.Eval(env).toString() == "true")
		{
			body.Eval(env);
		}
		return new Nil();
	}
}
