package syntax;

import semantics.Env;
import semantics.Type;

public class PairValue extends Value{
	Value e1;
	Value e2;
	
	
	public PairValue(Value e1, Value e2) {
		this.e1 = e1;
		this.e2 = e2;
		type = Type.PAIR;
	}

	Boolean isEqual(Value v){
		if(v.getType() == Type.PAIR) return false;
		PairValue pairV = (PairValue)v;
		if(e1.isEqual(pairV.getFirst()) && e2.isEqual(pairV.getSecond())) return true;
		else return false;
	}
	public String toString(){
		return "(" + e1.toString() + ", " + e2.toString() + ")";
	}
	
	public Value getFirst() {
		return e1;
	}

	public void setFirst(Value e) {
		this.e1 = e;
	}

	public Value getSecond() {
		return e2;
	}

	public void setSecond(Value e) {
		this.e2= e;
	}
}