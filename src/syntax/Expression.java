package syntax;

import semantics.EnvStack;
import semantics.Type;

public class Expression
{
	protected Type type;
//	protected Value value;
	public Expression() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean CheckType(){return true;}
	//implement this method and fill the real value into value
	public Value Eval(){return null;}
	
/*	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}
*/
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