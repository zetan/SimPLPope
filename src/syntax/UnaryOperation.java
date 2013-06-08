package syntax;

import semantics.Env;
import semantics.Type;

public class UnaryOperation extends Expression{
	enum UnaryOperator{
		unaryMinus, negative
	}
	
	Expression e;
	UnaryOperator op;

	public String toString(){
		String operator = "";
		switch(op){
		case unaryMinus:
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
		if(s == "~")this.op = UnaryOperator.unaryMinus;
	}
	
	public Value Eval(Env env){
		Value val = e.Eval(env);
		
		//try {
			
			if(this.op == UnaryOperator.unaryMinus){
				if(val.getType() != Type.INT){
					System.out.println(this.getClass().getName() + "op: ~, " + e.toString() + "is NOT a int");
					return null;
				}
				val = new IntValue(0 - Integer.parseInt(val.toString())); 
			} 
			if(this.op == UnaryOperator.negative) 
			{
				if(val.getType()== type.INT){
					if(Integer.parseInt(val.toString()) == 0) val = new BoolValue(true);
					else val = new BoolValue(false);
				}
				else if(val.getType()== type.BOOL){
					if(val.toString().equals("true"))val =new BoolValue(false);
					else val = new BoolValue(true); 
				}
				else{ //error
					System.out.println(this.getClass().getName() + "op: not, " + e.toString() + "is NOT a int or bool");
					return null;
				}
			}
			return val;
			
	/*	} catch (Exception e) {
			// TODO: handle exception
			System.out.println("type error");
		}
	*/
	

		
	}
}