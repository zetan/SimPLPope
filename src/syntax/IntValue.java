package syntax;

import semantics.Type;

public class IntValue extends Value{
	boolean isUndef;
	int value;

	
	public IntValue(String value){
		this.value = Integer.parseInt(value);
		type = Type.INT;
	}
	
	public Value Eval(){
		return this;
	}
	
	public String toString(){
		if(isUndef)
			return "undef";
		else
			return String.valueOf(value);
	}
	
	public IntValue(Integer value){
		
		this.value = value;
		this.type = Type.INT;
	}
	public IntValue(int value){
		
		this.value = value;
	}
}