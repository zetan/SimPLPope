package syntax;

public class AnonymousFunction extends Value{
	Variable arg;
	Expression body;
	
	public String toString(){
		return "fun " + arg.toString() + " -> " + body.toString();
	}

	public AnonymousFunction(Variable arg, Expression body) {
		super();
		this.arg = arg;
		this.body = body;
	}
}