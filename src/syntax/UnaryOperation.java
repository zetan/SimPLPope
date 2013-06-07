package syntax;

import semantics.Env;

public class UnaryOperation extends Expression{
	enum UnaryOperator{
		not, negative
	}
	
	Expression e;
	UnaryOperator op;

	public String toString(){
		String operator = "";
		switch(op){
		case not:
			operator = "~"; break;
		case negative:
			operator = "not "; break;
		}
		return operator + e.toString();
	}

	public UnaryOperation(String s,Expression e) {
		super();
		this.e = e;
		if(s == "not") this.op = UnaryOperator.not;	
		if(s == "~")this.op = UnaryOperator.negative;
	}
	
	public Value Eval(Env env){
		Value val = null;
		
		try {
			
			if(this.op == UnaryOperator.negative) val = new IntValue(~Integer.parseInt(e.Eval(env).toString()));
			if(this.op == UnaryOperator.not) val = new IntValue(-Integer.parseInt(e.Eval(env).toString()));	
			return val;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("head type error");
		}
		return null;

		
	}
}