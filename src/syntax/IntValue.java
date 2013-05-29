package syntax;

public class IntValue extends Value{
	boolean isUndef;
	int value;

	
	public IntValue(String value){
		this.value = Integer.parseInt(value);
	}
	
	public String toString(){
		if(isUndef)
			return "undef";
		else
			return String.valueOf(value);
	}
	
	public IntValue(Integer value){
		
		this.value = value;
	}
	
}