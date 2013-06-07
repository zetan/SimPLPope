package syntax;

import semantics.Env;

public class Second extends Expression{
	Expression e;
	
	public Second(Expression e) {
		super();
		this.e = e;
	}

	public String toString(){
		return "snd " + e.toString();
	}
	public Value Eval(Env env)
	{
		Value eValue = e.Eval(env);
		
		try {
			PairValue PairValue = (PairValue)eValue; /* type checking */
			return PairValue.getSecond();				// evaluate
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("pair type error");
		}
		return null;
	}
}