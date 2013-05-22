package lex;

public class Symbol {
	private SymType type;
	private Object value;
	private int line;
	
	public Symbol() {
		// TODO Auto-generated constructor stub
	}
	
	public Symbol(SymType type, int line){
		this.type = type;
		this.line = line;
	
	}
	
	public Symbol(SymType type, Object value, int line){
		this.type = type;
		this.value = value;
		this.line = line;
	}
	
	public void Print(){
		String valStr = "null";
		if(value != null) valStr = value.toString();
		System.out.println(this.getClass().getName() + "\t type = " + type + 
				"\tvalue = " + valStr  +  "\t line = " + line);
	}
}


