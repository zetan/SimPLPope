package syntax;

import semantics.EnvStack;
import semantics.Type;

public class Head extends Expression{
	Expression e;
	
	public Head(Expression e) {
		super();
		this.e = e;
		
	}

	public String toString(){
		return "head " + e.toString();
	}
	
	public boolean CheckType(){
		
		/*	if(e.IsVar() == true){
				Type eType = EnvStack.getInstance().getVarType((Variable)e);
				if(eType == Type.LIST) return true;
				else{
					System.out.println("head type error");
					return false;
				}
			}
			if(e.getType() == Type.LIST) return true;
			else{
				System.out.println("head type error");
				return false;
			}
		*/
		if(e.getType() == Type.LIST) return true;
		else{
			System.out.println("head type error");
			return false;
		}
		
	}
	
	public Type getType(){
		List elist = (List)e;
		type = elist.getHead().getType();
		return type;
	}
}