package syntax;

import semantics.Type;



public class Nil extends Value{
	
	public Type getType(){
		type = Type.LIST;
		return type;
	}
	
	public String toString(){
		return "nil";
	}
}