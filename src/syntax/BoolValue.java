package syntax;

import java.security.PublicKey;

import semantics.Env;
import semantics.Type;

public class BoolValue extends Value{
	boolean value;

	public String toString(){
		if(value)
			return "true";
		else
			return "false";
	}

	public BoolValue(boolean value) {
		super();
		this.value = value;
		type = Type.BOOL;
	}
	public Value Eval(Env env)
	{
		//BoolValue
		return this;
	}
	public Object clone() throws CloneNotSupportedException
	{
		BoolValue bv = null;
		bv = (BoolValue)super.clone();
		bv.value = value;
		return bv;
	}
	Boolean isEqual(Value v){
		if(v.getType() != Type.BOOL) return false;
		if(this.toString().equals(v.toString())) return true;
		else return false;
	}
}