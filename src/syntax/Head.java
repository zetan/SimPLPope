package syntax;

import semantics.Env;
import semantics.EnvStack;
import semantics.Type;

public class Head extends Expression {
	Expression e;

	public Head(Expression e) {
		super();
		this.e = e;

	}

	public String toString() {
		return "head " + e.toString();
	}

	public Value Eval(Env env) {

		// CheckType();
		/*
		 * Value eValue = e.Eval(env);
		 * 
		 * try { ListValue listValue = (ListValue)eValue; // type checking
		 * return listValue.getHead(); // evaluate } catch (Exception e) { //
		 * TODO: handle exception System.out.println("head type error"); }
		 * return null;
		 */
		Value eValue = e.Eval(env);
		if (eValue.getType() == Type.LIST) {
			ListValue listValue = (ListValue) eValue; /* type checking */
			return listValue.getHead();
		} else if (eValue.getType() == Type.UNIT) {
			System.out.println("Tail type error, " + e + "is NIL");
			return new Nil();
		} else {
			System.out
					.println("Tail type error, " + e + "is Not a list or nil");
			return new Nil();
		}
	}

	public boolean CheckType() {
		// System.out.println(e.getType());
		if (e.getType() == Type.LIST)
			return true;
		else {
			System.out.println("head type error");
			return false;
		}

	}

	public Type getType() {
		List elist = (List) e;
		type = elist.getHead().getType();
		return type;
	}
}