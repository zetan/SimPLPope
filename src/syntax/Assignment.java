package syntax;

public class Assignment extends Expression{
	Expression var;
	Expression val;
	
	public Assignment(Expression var, Expression val) {
		super();
		this.var = var;
		this.val = val;
	}

	public String toString(){
		return var.toString() + " := " + val.toString();
	}
}