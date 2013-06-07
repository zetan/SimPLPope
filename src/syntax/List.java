package syntax;


import semantics.*;
public class List extends Expression{
	public List(Expression head, Expression tail) {
		super();
		this.head = head;
		this.tail = tail;
	}

	Expression head;
	Expression tail;	
	
	public Value Eval(Env env){
		return new ListValue(head.Eval(env), tail.Eval(env));
	}
	
	public Type getType(){
		type = Type.LIST;
		return type;
	}
	
	public String toString(){
		return "[" + head.toString() + ", " + tail.toString() + "]";
	}

	public Expression getHead() {
		return head;
	}

	public void setHead(Expression head) {
		this.head = head;
	}

	public Expression getTail() {
		return tail;
	}

	public void setTail(Expression tail) {
		this.tail = tail;
	}
	
}