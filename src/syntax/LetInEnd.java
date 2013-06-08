package syntax;

import semantics.Env;
import semantics.EnvStack;
import semantics.Type;

public class LetInEnd extends Expression{
	Variable x;
	Expression definition;
	Expression body;
	int orgStackNum;
	public String toString(){
		return "let " + x.toString() + " = " + definition.toString() + " in " + body.toString() + " end";
	}

	public LetInEnd(Variable x, Expression definition, Expression body) {
		super();
		this.x = x;
		this.definition = definition;
		this.body = body;
	}
	
	public Value Eval(Env _env){
		//CheckType();
		orgStackNum = EnvStack.getInstance().getStackNum();
		Env env = new Env();
		env.getVarSet().add(x.toString());
		
	//	env.getTypeMap().put(x.toString(), definition.getType());
		//env.getExpMap().put(x.toString(), (Value)definition);
		
		EnvStack.getInstance().PushEnv(env);
		
		Value xDef = definition.Eval(env);
//		env.getTypeMap().put(x.toString(), xDef.getType());				// set var type
		EnvStack.getInstance().getVarEnv(x).AddValue(x.toString(), xDef);//set var value
		
		Value value = body.Eval(_env);
		
		int curStackNum =  EnvStack.getInstance().getStackNum();
		for(int i = 0; i < curStackNum - orgStackNum; i++)
			EnvStack.getInstance().PopEnv();
		return value;
	}

/*	public boolean CheckType(){
		Env env = new Env();
		env.getVarSet().add(x.toString());
		definition.CheckType(); 
		env.getTypeMap().put(x.toString(), definition.getType());
		x.setType(definition.getType());
		EnvStack.getInstance().PushEnv(env);	
		body.CheckType();
	
		return true;
	}*/
	
	public Type getType(){
		this.type = body.getType();
		return type;
	}
}