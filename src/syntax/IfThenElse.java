package syntax;

public class IfThenElse extends Expression{
	Expression condition;
	Expression thenClause;
	Expression elseClause;
	
	public String toString(){
		return "if " + condition.toString() + " then " + thenClause.toString() + " else " + elseClause.toString();
	}

	public IfThenElse(Expression condition, Expression thenClause,
			Expression elseClause) {
		super();
		this.condition = condition;
		this.thenClause = thenClause;
		this.elseClause = elseClause;
	}
	
	public Value Eval()
	{
		Value value = null;
		try {
			if( condition.Eval().toString() == "true")
			{
				return thenClause.Eval();
			}
		/*	else if(Integer.parseInt(condition.Eval().toString()) > 0)
			{
				return thenClause.Eval();
			}
			else
			{
				return elseClause.Eval();
			}*/
			else{
				return elseClause.Eval();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("type error");
		}
		return value;
	}
	
}