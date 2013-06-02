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
	
	public Value Eval()
	{
		Value eValue = e.Eval();
		
		try {
			ListValue listValue = (ListValue)eValue; /* type checking */
			return listValue.getTail();				// evaluate
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("head type error");
		}
		return null;
	}
}