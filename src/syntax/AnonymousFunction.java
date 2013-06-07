package syntax;

import semantics.Env;
import semantics.EnvStack;
import semantics.Type;

public class AnonymousFunction extends Value{
	Variable arg;
	Expression body;
	Env env = new Env();
	public String toString(){
		return "fun " + arg.toString() + " -> " + body.toString();
	}

	public Variable getArg() {
		return arg;
	}

	public void setArg(Variable arg) {
		this.arg = arg;
	}

	public Expression getBody() {
		return body;
	}

	public void setBody(Expression body) {
		this.body = body;
	}

	public AnonymousFunction(Variable arg, Expression body) {
		super();
		this.arg = arg;
		this.body = body;
		this.type = Type.FUNCITON;
		if(body.getType() == Type.FUNCITON){
			AnonymousFunction funcBody = (AnonymousFunction)body;
			funcBody.setEnv(this.env);
		}
	}
	public Value Eval(Env _env){
		
		return this;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		AnonymousFunction fun = null;
		fun = (AnonymousFunction) super.clone();
		fun.arg = (Variable)(arg.clone());
		fun.body = (Expression)(body.clone());
		fun.env = (Env)(env.clone());
		return fun;
	}

	public Env getEnv() {
		return env;
	}

	public void setEnv(Env env) {
		this.env = env;
	}
	
}