package syntax;

import java.security.PublicKey;

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
	public Value Eval()
	{
		//BoolValue
		return this;
	}
}