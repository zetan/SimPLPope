package syntax;

public class Bracket extends Expression{
	Expression e;
	
	public Bracket(Expression e) {
		super();
		this.e = e;
	}

	public String toString(){
		return "(" + e.toString() + ")";
	}
	public Value Eval()
	{
		return e.Eval();
	}
}