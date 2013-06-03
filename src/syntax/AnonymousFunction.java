package syntax;

import semantics.Env;
import semantics.EnvStack;
import semantics.Type;

public class AnonymousFunction extends Value{
	Variable arg;
	Expression body;
	
	public String toString(){
		return "fun " + arg.toString() + " -> " + body.toString();
	}

	public Variable getArg() {
		return arg;
	}

	public void setArg(Variable arg) {
		this.arg = arg;
	}

	public Expression getBody() {
		return body;
	}

	public void setBody(Expression body) {
		this.body = body;
	}

	public AnonymousFunction(Variable arg, Expression body) {
		super();
		this.arg = arg;
		this.body = body;
		this.type = Type.FUNCITON;
	}
	public Value Eval(){
	/*	Value val = null;
		try {
			Value value = null;
			Env env = new Env();
			env.getVarSet().add(arg.toString());
			env.getValueMap().put(arg.toString(),EnvStack.getInstance().getVarValue(arg)); //设置 fun中的Env ，并将值绑定到 变量上
			
			return body.Eval();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("type error");
		}
		return null;
		*/
		
		Env env = new Env();
		System.out.println("AnonymousFunction push var = " + arg.toString());
		env.getVarSet().add(arg.toString());		
		env.getValueMap().put(arg.toString(),null); //设置 fun中的Env ，并将值绑定到 变量上
		EnvStack.getInstance().PushEnv(env);
	//	System.out.println("push env");
		return this;
	}
	
}