import java.io.FileReader;

import syntax.Expression;
import syntax.Value;

import lex.Parser;
import lex.Lexer;

public class SimplPope {
	public static void main(String[] args){
		Parser parser = null;
		Expression expression = null;
		try {
			parser = new Parser(
                new Lexer(System.in));
            expression = (Expression) parser.parse().value;
            //System.out.println(expression.toString());
           
        }
        catch (Exception e) {
        	String errString = "";
        	Object info = new Object();
        	parser.report_error(errString, info);
            System.out.println("err string = " + errString);
            System.out.println("info " + info);
	    
        }
		 Value value = expression.Eval(null);
         System.out.println(value.toString());
	}
}
