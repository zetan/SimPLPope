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