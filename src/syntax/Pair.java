package syntax;

import semantics.Env;
import semantics.Type;

public class Pair extends Expression{
	Expression e1;
	Expression e2;
	
	public String toString(){
		return "(" + e1.toString() + ", " + e2.toString() + ")";
	}

	public Pair(Expression e1, Expression e2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
		
		type = Type.PAIR;
	}
	public Value Eval(Env env)
	{
		return new PairValue(e1.Eval(env), e2.Eval(env));
	}
}