package semantics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import syntax.Value;
import syntax.Variable;

public class Env implements Cloneable{
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
	
	public Object clone()
	{
		Env cloned = null;
		
		try {
			
			
			cloned  = (Env) super.clone();
			cloned.typeMap = new HashMap<String, Type>();
			Iterator<Entry<String,Type >> it1 = typeMap.entrySet().iterator();
			while(it1.hasNext())
			{
				Map.Entry<String, Type> entry = it1.next();
				String K = entry.getKey();
				Type V = entry.getValue();
				cloned.typeMap.put(new String(K), V);
			}
			
			cloned.valueMap = new HashMap<String, Value>();
			Iterator<Entry<String,Value >> it2 = valueMap.entrySet().iterator();
			while(it2.hasNext())
			{
				Map.Entry<String, Value> entry = it2.next();
				String K = entry.getKey();
				Value V = entry.getValue();
				cloned.valueMap.put(new String(K), null);
			}
			
			
			cloned.varSet = new  HashSet<String>();
			Iterator it3 = varSet.iterator();
			while(it3.hasNext())
			{
				
				String K = (String) it3.next();
				
				cloned.varSet.add(new String(K));
			}
			
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cloned;
	}
	
	public String toString(){
		String str = "";
		for(Entry<String, Value> entry : valueMap.entrySet()){
			str += entry.getKey() + " = " + entry.getValue().toString() + "\t";
		}
		return str;
	}
}
