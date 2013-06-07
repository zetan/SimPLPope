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
		
		if(env == null) env = new Env();
		Value funcValue = func.Eval(env);
		
		if(funcValue.getType() != Type.FUNCITON){
			System.out.println("Application type error: func is NOT a function");
			return null;
		}
		AnonymousFunction function = (AnonymousFunction)funcValue;
		try {
			function = (AnonymousFunction)function.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("---------------Application-------------------------");
		//Env funcEnv = (Env)function.getEnv().clone();
		function.getEnv().AddValue(function.getArg().toString(), param.Eval(env));
		System.out.println("function.getEnv = " + function.getEnv());
		System.out.println("function.body = " + function.getBody());
		//merge the env
		if(function.getBody().getType() != Type.FUNCITON)
			EnvStack.getInstance().PushEnv(function.getEnv());
		return function.getBody().Eval(function.getEnv());
		
	}

}