package syntax;

public class BoolValue extends Value{
	boolean value;

	public String toString(){
		if(value)
			return "true";
		else
			return "false";
	}

	public BoolValue(boolean value) {
		super();
		this.value = value;
	}
}