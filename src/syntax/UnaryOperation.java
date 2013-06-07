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
		if(s == "not") this.op = UnaryOperator.negative;	
		if(s == "~")this.op = UnaryOperator.not;
	}
	
	public Value Eval(Env env){
		Value val = e.Eval(env);
		
		try {
			
			if(this.op == UnaryOperator.not) val = new IntValue(~Integer.parseInt(val.toString()));
			if(this.op == UnaryOperator.negative) 
			{
				if(e.getType()== type.INT)val = new IntValue(-Integer.parseInt(val.toString()));	
				if(e.getType()== type.BOOL)
						if(val.toString() == "true")val =new BoolValue(false);
						else val = new BoolValue(true); 
			}
			return val;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("type error");
		}
		return null;

		
	}
}