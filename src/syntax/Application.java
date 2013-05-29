package syntax;

public class Application extends Expression{
	Expression func;
	Expression param;

	public String toString(){
		return "(" + func.toString() + " " + param.toString() + ")";
	}

	public Application(Expression func, Expression param) {
		super();
		this.func = func;
		this.param = param;
	}


}