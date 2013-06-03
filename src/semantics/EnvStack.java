package semantics;

import java.util.List;
import java.util.ArrayList;

import syntax.Value;
import syntax.Variable;

public class EnvStack {
	List<Env> envStack = new ArrayList<>();
	private static EnvStack instance;
	
	private EnvStack() {
		//super();
	}

	public Env getVarEnv(Variable var){
		for(int i = envStack.size() -1; i >= 0; i--){
			if(envStack.get(i).getVarSet().contains(var.toString())) return envStack.get(i);
		}
		return null;
	}
	
	public Type getVarType(Variable var){
		for(int i = envStack.size() -1; i >= 0; i--){
			Type type = envStack.get(i).getTypeMap().get(var.toString());
			if(type != null) return type;
			
		}
		return null;
	}
	
	public Value getVarValue(Variable var){
		for(int i = envStack.size() -1; i >= 0; i--){
			Value val = envStack.get(i).getValueMap().get(var.toString());
			if(val != null) return val;
		}
		return null;
	}
	public void PushEnv(Env env){
		envStack.add(env);
	}
	
	public void PopEnv(){
		envStack.remove(envStack.size() -1);
	}
	
	public int getStackNum(){
		return envStack.size();
	}
	
	public static EnvStack getInstance(){
		if(instance == null) instance = new EnvStack();
		return instance;
	}
}
