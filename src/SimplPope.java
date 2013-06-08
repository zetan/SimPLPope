import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import syntax.Expression;
import syntax.Value;

import lex.Parser;
import lex.Lexer;

public class SimplPope {
	public static void main(String[] args){
		if (args.length == 1 && args[0].equals("-s")) {
			Console();
		} else if (args.length == 2 && args[0].equals("-f")){
			FromFile(args[1]);
		} 
		else{
			System.out.println("usage: -s | -f [filename]");
		}
	}
	
	static void Console(){
		Parser parser = null;
		Expression expression = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String code = "";
		while(true){
			System.out.print("SimPL>");
			
			String line = "";
			while(true){		//read from System.in until we meet '$'
				try {
					line = reader.readLine();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				code += line;
				if(line.contains("$")){
					break;
				}
			}
			byte[] byteCode = null;		// get the input code into byte-array and we will put the byte-array into lexer
			try {
				byteCode = code.getBytes("UTF-8");
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			code = "";	//waiting for the next iteration
			
			parser = new Parser(new Lexer(new ByteArrayInputStream(byteCode)));
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
