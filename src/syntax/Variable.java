package syntax;

import semantics.EnvStack;
import semantics.Type;

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
	
	public Value Eval(){
		CheckType();
		return EnvStack.getInstance().getVarValue(this);
	}
	
	public boolean CheckType(){
		if(EnvStack.getInstance().getVarType(this) != null) return true;
		else return false;
	}
	
	public Type getType(){
		type = EnvStack.getInstance().getVarType(this);
		return type;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Variable var =null;
		var = (Variable)super.clone();
		var.name = name;
		return var;
		
	}
}