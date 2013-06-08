package syntax;

import semantics.Env;
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
	public Value Eval(Env env){
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
		this.type = Type.INT;
	}
	
	Boolean isEqual(Value v){
		if(v.getType() != Type.INT) return false;
		if(this.toString().equals(v.toString())) return true;
		else return false;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		IntValue val = null;
		val = (IntValue)super.clone();
		val.value =value;
		val.isUndef =isUndef;
		return val;
	}
}