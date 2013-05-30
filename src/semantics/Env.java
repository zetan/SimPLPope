package semantics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import syntax.Value;
import syntax.Variable;

public class Env {
	private Set<String> varSet = new HashSet<String>();
	private Map<String, Type> typeMap = new HashMap<String, Type>();
	private Map<String, Value> valueMap = new HashMap<String, Value>();
	
	public Env(){}

	
	public void AddType(String var, Type type){
		typeMap.put(var, type);
		
	}
	public void AddValue(String var, Value val){
		valueMap.put(var, val);
	}


	public Set<String> getVarSet() {
		return varSet;
	}


	public void setVarSet(Set<String> varSet) {
		this.varSet = varSet;
	}


	public Map<String, Type> getTypeMap() {
		return typeMap;
	}


	public void setTypeMap(Map<String, Type> typeMap) {
		this.typeMap = typeMap;
	}


	public Map<String, Value> getValueMap() {
		return valueMap;
	}


	public void setValueMap(Map<String, Value> valueMap) {
		this.valueMap = valueMap;
	}
	
	
	
}
