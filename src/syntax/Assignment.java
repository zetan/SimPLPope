package syntax;

import semantics.Env;
import semantics.EnvStack;

public class Assignment extends Expression{
	Expression var;
	Expression val;
	
	public Assignment(Expression var, Expression val) {
		super();
		this.var = var;
		this.val = val;
	}

	public String toString(){
		return var.toString() + " := " + val.toString();
	}
	public Value Eval(Env env)
	{
		if(!var.getClass().getName().contains("Variable")){
			System.out.println(this.getClass().getName() + ": Type error: var is not a Variable");
			return null;
		}
		Variable v = (Variable)var;
		Value value = val.Eval(env);
		if(env != null) env.AddValue(var.toString(), value);
		EnvStack.getInstance().getVarEnv(v).AddValue(v.toString(), value);
		//EnvStack.getInstance().getStackTop().AddValue(v.toString(), value);
		return new Nil();
	}
}