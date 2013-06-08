package syntax;
import semantics.Env;
import semantics.EnvStack;
import semantics.Type;

public class BinaryOperation extends Expression{
	enum BinaryOperator{
		plus, minus, times, devide, biggerThan, lessThan, equal, and, or
	}
	
	Expression e1;
	Expression e2;
	BinaryOperator op;
	
	public String toString(){
		String operator = "";
		switch(this.op){
		case plus:
			operator = "+"; break;
		case minus:
			operator = "-"; break;
		case times:
			operator = "*"; break;
		case devide:
			operator = "/"; break;
		case biggerThan:
			operator = ">"; break;
		case lessThan:
			operator = "<"; break;
		case equal:
			operator = "="; break;
		case and:
			operator = "and"; break;
		case or:
			operator = "or"; break;
		}
		return e1.toString() + " " + operator + " " + e2.toString();
	}

	public BinaryOperation(Expression e1, String s ,Expression e2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
		switch(s){
		case "+":
			this.op = BinaryOperator.plus; break;
		case "-":
			this.op = BinaryOperator.minus; break;
		case "*":
			this.op = BinaryOperator.times; break;
		case "/":
			this.op = BinaryOperator.devide; break;
		case ">":
			this.op = BinaryOperator.biggerThan; break;
		case "<":
			this.op = BinaryOperator.lessThan; break;
		case "=":
			this.op = BinaryOperator.equal; break;
		case "and":
			this.op = BinaryOperator.and; break;
		case "or":
			this.op = BinaryOperator.or; break;
		}
	}
	
	public Value Eval(Env env){
		Value val = null;
		Value v1, v2;
		v1 = e1.Eval(env);
		v2 = e2.Eval(env);
	//	try {	/* type checking */ 
	/*		if(this.op == BinaryOperator.plus)
			{
				
				val = new IntValue(Integer.parseInt(e1.Eval().toString())+Integer.parseInt(e2.Eval().toString()));// evaluate, 
				return val;		
			}
	*/
			switch(this.op){
			
			case plus:	
						if(v1.getType() != Type.INT || v2.getType() != Type.INT){
							System.out.println("Binary type error: op = +, e1 = " + e1.toString() + ", e2 = " + e2.toString());
						}
						return new IntValue(Integer.parseInt(v1.toString())+Integer.parseInt(v2.toString()));
								
						
			case minus:	
					if(v1.getType() != Type.INT || v2.getType() != Type.INT){
						System.out.println("Binary type error: op = -, e1 = " + e1.toString() + ", e2 = " + e2.toString());
					}
					return new IntValue(Integer.parseInt(v1.toString())-Integer.parseInt(v2.toString()));
						
			case times:	
				if(v1.getType() != Type.INT || v2.getType() != Type.INT){
					System.out.println("Binary type error: op = *, e1 = " + e1.toString() + ", e2 = " + e2.toString());
				}
				return new IntValue(Integer.parseInt(v1.toString())*Integer.parseInt(v2.toString()));
						
			case devide:
				if(v1.getType() != Type.INT || v2.getType() != Type.INT){
					System.out.println("Binary type error: op = /, e1 = " + e1.toString() + ", e2 = " + e2.toString());
				}
					if(Integer.parseInt(v2.toString()) == 0){System.out.println("DIVIOR is ZERO: " + v2.toString());}
					return new IntValue(Integer.parseInt(v1.toString())/Integer.parseInt(v2.toString()));
					
			case biggerThan: 
				if(v1.getType() != Type.INT || v2.getType() != Type.INT){
					System.out.println("Binary type error: op = >, e1 = " + e1.toString() + ", e2 = " + e2.toString());
				}
				if(Integer.parseInt(v1.toString())>Integer.parseInt(v2.toString()))
								val = new BoolValue(true);// evaluate, 
							 else val = new BoolValue(false); 
						return val;	
				
			case lessThan: 
				if(v1.getType() != Type.INT || v2.getType() != Type.INT){
					System.out.println("Binary type error: op = <, e1 = " + e1.toString() + ", e2 = " + e2.toString());
				}
				if(Integer.parseInt(v1.toString())<Integer.parseInt(v2.toString()))
					val = new BoolValue(true);// evaluate, 
				else val = new BoolValue(false); 
				return val;	
				
			case equal: 
			//	System.out.println("x = " + e1.Eval().toString());
			//	System.out.println("e2 = " + e2.Eval().toString());
		/*		if(Integer.parseInt(v1.toString()) == Integer.parseInt(v2.toString()))
					val = new BoolValue(true);// evaluate, 
				 else val = new BoolValue(false); 
		*/
				if(v1.getType() != v2.getType()){System.out.println("---------------------");}
	//			System.out.println("-----------v1 = " + v1 + "\t v2 = " + v2 + "\t isequal = " + v1.isEqual(v2));
				if(v1.isEqual(v2)) val = new BoolValue(true);
				else val = new BoolValue(false);
			return val;	
		//return val;	
				
			case and:
				
				if(v1.getType() != Type.BOOL || v2.getType() != Type.BOOL){
					System.out.println(this.getClass().getName() + "type error:AND, is not bool value");
				}
				if(v1.toString().equals("true") && v2.toString().equals("true")) return new BoolValue(true);
				else return new BoolValue(false);
			//	if(e1.Eval(env).toString() == "true" e2.Eval(env).toString())
			//	val = new IntValue(Integer.parseInt(e1.Eval(env).toString())&Integer.parseInt(e2.Eval(env).toString()));// evaluate, 
			//	return val;	
			case or:
				
				if(v1.getType() != Type.BOOL || v2.getType() != Type.BOOL){
					System.out.println(this.getClass().getName() + "type error:OR is not bool value");
				}
				if(v1.toString().equals("true") || v2.toString().equals("true")) return new BoolValue(true);
				else return new BoolValue(false);
			//	val = new IntValue(Integer.parseInt(e1.Eval(env).toString())|Integer.parseInt(e2.Eval(env).toString()));// evaluate, 
			//	return val;	
			}
			
			 
	return null;
	}
	/*	catch (Exception e) {
				// TODO: handle exception
			System.out.println("Binary type error");
		}
		return null;
		
	}*/
	
}