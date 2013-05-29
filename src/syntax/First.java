package syntax;

public class First extends Expression{
	Expression e;
	
	public First(Expression e) {
		super();
		this.e = e;
	}

	public String toString(){
		return "fst " + e.toString();
	}
}