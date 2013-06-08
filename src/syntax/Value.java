package syntax;

import java.awt.Window.Type;

public class Value extends Expression{
	
	
/*	int intValue;
	boolean boolValue;
	AnonymousFunction funcValue;
	List listValue;
	Pair pair;
	
	public Value(int intValue) {
		this.intValue = intValue;
	}
	
	
	public Value(boolean boolValue) {
		this.boolValue = boolValue;
	}


	public Value(AnonymousFunction funcValue) {
		this.funcValue = funcValue;
	}


	public Value(List listValue) {
		this.listValue = listValue;
	}


	public Value(Pair pair) {
		this.pair = pair;
	}


	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	public boolean isBoolValue() {
		return boolValue;
	}
	public void setBoolValue(boolean boolValue) {
		this.boolValue = boolValue;
	}
	public AnonymousFunction getFuncValue() {
		return funcValue;
	}
	public void setFuncValue(AnonymousFunction funcValue) {
		this.funcValue = funcValue;
	}
	public List getListValue() {
		return listValue;
	}
	public void setListValue(List listValue) {
		this.listValue = listValue;
	}


	public Pair getPair() {
		return pair;
	}


	public void setPair(Pair pair) {
		this.pair = pair;
	}
	*/
	public Object clone() throws CloneNotSupportedException
	{
		Value v = null;
		v = (Value)super.clone();
		return v;
	}
	
	Boolean isEqual(Value v){
		return false;
	}
}