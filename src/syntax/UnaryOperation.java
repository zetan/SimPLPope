package syntax;

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
}