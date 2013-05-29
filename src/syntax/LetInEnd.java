package syntax;

public class LetInEnd extends Expression{
	Variable x;
	Expression definition;
	Expression body;
	
	public String toString(){
		return "let " + x.toString() + " = " + definition.toString() + " in " + body.toString() + " end";
	}

	public LetInEnd(Variable x, Expression definition, Expression body) {
		super();
		this.x = x;
		this.definition = definition;
		this.body = body;
	}

}