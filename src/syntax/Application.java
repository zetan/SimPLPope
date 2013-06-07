package syntax;

import semantics.Env;
import semantics.EnvStack;
import semantics.Type;

public class Application extends Expression{
	Expression func;
	Expression param;

	public String toString(){
		return "(" + func.toString() + " " + param.toString() + ")";
	}

	public Application(Expression func, Expression param) {
		super();
		this.func = func;
		this.param = param;
	}

	public Value Eval(Env env)
	{
		
		Value funcValue = func.Eval(env);
		
		if(funcValue.getType() != Type.FUNCITON){
			System.out.println("Application type error: func is NOT a function");
			return null;
		}
		AnonymousFunction function = (AnonymousFunction)funcValue;
		System.out.println("Application function.getArg() = "+ function.getArg());
		EnvStack.getInstance().getVarEnv(function.getArg()).AddValue(function.getArg().toString(), param.Eval(env));
		return function.getBody().Eval(env);
		
	}

}