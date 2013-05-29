package syntax;

public class Tail extends Expression{
	Expression e;	
	
	public Tail(Expression e) {
		super();
		this.e = e;
	}

	public String toString(){
		return "tail " + e.toString();
	}
}