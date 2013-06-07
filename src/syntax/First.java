package syntax;

import semantics.Env;

public class First extends Expression{
	Expression e;
	
	public First(Expression e) {
		super();
		this.e = e;
	}

	public String toString(){
		return "fst " + e.toString();
	}
	public Value Eval(Env env)
	{
		Value eValue = e.Eval(env);
		
		try {
			PairValue PairValue = (PairValue)eValue; /* type checking */
			return PairValue.getFirst();				// evaluate
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("pair type error");
		}
		return null;
	}
}