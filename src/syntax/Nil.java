package syntax;

import semantics.Env;
import semantics.Type;



public class Nil extends Value{
	
	public Type getType(){
		type = Type.UNIT;
		return type;
	}
	
	public String toString(){
		return "nil";
	}
	public Value Eval(Env env){
		return this;
	}
	public Boolean isEqual(Value v){
		if(v.getType() == Type.UNIT) return true;
		else return false;
	}
}