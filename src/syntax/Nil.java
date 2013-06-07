package syntax;

import semantics.Type;



public class Nil extends Value{
	
	public Type getType(){
		type = Type.UNIT;
		return type;
	}
	
	public String toString(){
		return "nil";
	}
}