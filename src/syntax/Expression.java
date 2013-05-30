package syntax;

import semantics.EnvStack;
import semantics.Type;

public class Expression
{
	protected Type type;
	public Expression() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean CheckType(){return true;}
	public Type getType(){
		if(this.getClass().getName().contains("Variable")) return EnvStack.getInstance().getVarType((Variable)this);
		else return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public boolean IsVar(){
		if(this.getClass().getName().contains("Variable")) return true;
		else return false;
	}
}