package syntax;

import semantics.Env;

public class Bracket extends Expression{
	Expression e;
	
	public Bracket(Expression e) {
		super();
		this.e = e;
	}

	public String toString(){
		return "(" + e.toString() + ")";
	}
	public Value Eval(Env env)
	{
		return e.Eval(env);
	}
}