package syntax;

public class WhileDoEnd extends Expression{
	Expression condition;
	Expression body;
	
	public WhileDoEnd(Expression condition, Expression body) {
		super();
		this.condition = condition;
		this.body = body;
	}

	public String toString(){
		return "while " + condition.toString() + " do " + body.toString() + " end";
	}
}
