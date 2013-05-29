package syntax;

public class Second extends Expression{
	Expression e;
	
	public Second(Expression e) {
		super();
		this.e = e;
	}

	public String toString(){
		return "snd " + e.toString();
	}
}