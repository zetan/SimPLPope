package syntax;

import semantics.Env;

public class Nop extends Value{
	public String toString(){
		return "()";
	}
	public Nop() {
		// TODO Auto-generated constructor stub
	}
	public Value Eval(Env env)
	{
		return this;
	}
}