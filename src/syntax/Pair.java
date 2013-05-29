package syntax;

public class Pair extends Expression{
	Expression e1;
	Expression e2;
	
	public String toString(){
		return "(" + e1.toString() + ", " + e2.toString() + ")";
	}

	public Pair(Expression e1, Expression e2) {
		super();
		this.e1 = e1;
		this.e2 = e2;
	}
}