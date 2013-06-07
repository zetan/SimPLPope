package syntax;

import semantics.Env;

public class Sequence extends Expression{
	Expression e1;
	Expression e2;

	public String toString(){
		return e1.toString() + "; " + e2.toString();
	}

	public Sequence(Expression e1, Expression e2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public Value Eval(Env env){
		e1.Eval(env);
		return e2.Eval(env);
	}
}