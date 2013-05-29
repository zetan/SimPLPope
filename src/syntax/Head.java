package syntax;

public class Head extends Expression{
	Expression e;
	
	public Head(Expression e) {
		super();
		this.e = e;
	}

	public String toString(){
		return "head " + e.toString();
	}
}