package syntax;
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
	
	public Value Eval(){
		Value val = null;
		try {	/* type checking */ 
			if(this.op == BinaryOperator.plus)
			{
				
				val = new IntValue(Integer.parseInt(e1.Eval().toString())+Integer.parseInt(e2.Eval().toString()));// evaluate, 
				return val;		
			}
			switch(this.op){
			
			case plus:	val = new IntValue(Integer.parseInt(e1.Eval().toString())+Integer.parseInt(e2.Eval().toString()));// evaluate, 
						return val;		
						
			case minus:	val = new IntValue(Integer.parseInt(e1.Eval().toString())-Integer.parseInt(e2.Eval().toString()));// evaluate, 
						return val;	
						
			case times:	val = new IntValue(Integer.parseInt(e1.Eval().toString())*Integer.parseInt(e2.Eval().toString()));// evaluate, 
						return val;	
						
			case devide:if(Integer.parseInt(e2.Eval().toString()) == 0){ System.out.println("num error"); return null;}val = new IntValue(Integer.parseInt(e1.Eval().toString())/Integer.parseInt(e2.Eval().toString()));// evaluate, 
						return val;	
					
			case biggerThan: if(Integer.parseInt(e1.Eval().toString())>Integer.parseInt(e2.Eval().toString()))
								val = new BoolValue(true);// evaluate, 
							 else val = new BoolValue(false); 
						return val;	
				
			case lessThan: if(Integer.parseInt(e1.Eval().toString())<Integer.parseInt(e2.Eval().toString()))
				val = new BoolValue(true);// evaluate, 
			 else val = new BoolValue(false); 
		return val;	
				
			case equal: if(Integer.parseInt(e1.Eval().toString()) == Integer.parseInt(e2.Eval().toString()))
				val = new BoolValue(true);// evaluate, 
			 else val = new BoolValue(false); 
		return val;	
				
			case and:
				val = new IntValue(Integer.parseInt(e1.Eval().toString())&Integer.parseInt(e2.Eval().toString()));// evaluate, 
				return val;	
			case or:
				val = new IntValue(Integer.parseInt(e1.Eval().toString())|Integer.parseInt(e2.Eval().toString()));// evaluate, 
				return val;	
			}
			
		} 
		catch (Exception e) {
				// TODO: handle exception
			System.out.println("type error");
		}
		return null;
		
	}
	
}