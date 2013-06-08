import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

import syntax.Expression;
import syntax.Value;

import lex.Parser;
import lex.Lexer;

public class SimplPope {
	public static void main(String[] args){
		if (args.length == 1 && args[0].equals("-s")) {
			Console();
		} else if (/*args.length == 2 && */args[0].equals("-f")){
			FromFile("src/TestProgram");
		} 
		else{
			System.out.println("usage: -s | -f [filename]");
		}
	}
	
	static void Console(){
		Parser parser = null;
		Expression expression = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		parser = new Parser(new Lexer(reader));
		while(true){
			System.out.print("SimPL>");
			try {
				 expression = (Expression) parser.parse().value;
			}catch (Exception e) {
				System.out.println("syntax error");
				continue;
			}
			 Value value = expression.Eval(null);
	         if(value != null)System.out.println(value.toString());         
		}
	}
	
	static void FromFile(String filename){
		Parser parser = null;
		Expression expression = null;
		FileReader reader;
		try {
			reader = new FileReader(filename);
			
		}catch (Exception e) {
			System.out.println("file not found");
			return;
		}
		parser = new Parser(new Lexer(reader));
		try {
			 expression = (Expression) parser.parse().value;
		}catch (Exception e) {
			System.out.println("syntax error");
			return;
		}
		 Value value = expression.Eval(null);
        if(value != null)System.out.println(value.toString());    
	}
	
}
