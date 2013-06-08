package syntax;

import semantics.Env;
import semantics.Type;

public class Tail extends Expression{
	Expression e;	
	
	public Tail(Expression e) {
		super();
		this.e = e;
	}

	public String toString(){
		return "tail " + e.toString();
	}
	
	public Value Eval(Env env)
	{
		Value eValue = e.Eval(env);
		if(eValue.getType() == Type.LIST){
			ListValue listValue = (ListValue)eValue; /* type checking */
			return listValue.getTail();				// evaluate
		}else if(eValue.getType() == Type.UNIT){
			System.out.println("Tail type error, " + e + "is NIL");
			return new Nil();
		}else{
			System.out.println("Tail type error, " + e + "is Not a list or nil");
			return new Nil();
		}
	/*	try {
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("head type error");
		}
		return null;
	*/
	}
}