package syntax;

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
	
}