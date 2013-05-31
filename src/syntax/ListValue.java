package syntax;

import semantics.Type;

public class ListValue extends Value{
	Value head;
	Value tail;
	
	public ListValue(Value head, Value tail) {
		this.head = head;
		this.tail = tail;
		type = Type.LIST;
	}

	public String toString(){
		return "[" + head.toString() + ", " + tail.toString() + "]";
	}

	public Value getHead() {
		return head;
	}

	public void setHead(Value head) {
		this.head = head;
	}

	public Value getTail() {
		return tail;
	}

	public void setTail(Value tail) {
		this.tail = tail;
	}
	
}