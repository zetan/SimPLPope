package syntax;

import semantics.Env;
import semantics.EnvStack;

public class AnonymousFunction extends Value{
	Variable arg;
	Expression body;
	
	public String toString(){
		return "fun " + arg.toString() + " -> " + body.toString();
	}

	public AnonymousFunction(Variable arg, Expression body) {
		super();
		this.arg = arg;
		this.body = body;
	}
	public Value Eval(){
		Value val = null;
		try {
			Value value = null;
			Env env = new Env();
			env.getVarSet().add(arg.toString());
			env.getValueMap().put(arg.toString(),EnvStack.getInstance().getVarValue(arg)); //���� fun�е�Env ������ֵ�󶨵� ������
			
			return body.Eval();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("type error");
		}
		return null;
	}
	
}