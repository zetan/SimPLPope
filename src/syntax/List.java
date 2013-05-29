package syntax;

public class List extends Expression{
	public List(Expression head, Expression tail) {
		super();
		this.head = head;
		this.tail = tail;
	}

	Expression head;
	Expression tail;	
	
	public String toString(){
		return "[" + head.toString() + ", " + tail.toString() + "]";
	}
}