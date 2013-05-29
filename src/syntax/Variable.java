package syntax;

public class Variable extends Expression{
	String name;
	


	public Variable(String name) {
		super();
		this.name = name;
	}

	public Variable(Variable v)
	{
		name = v.name;
	}

	public String toString(){
		return name;
	}
}