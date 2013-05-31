import java.io.FileReader;

import syntax.Expression;
import syntax.Value;

import lex.Parser;
import lex.Lexer;

public class SimplPope {
	public static void main(String[] args){
		try {
			Parser parser = new Parser(
                new Lexer(new FileReader("src/TestProgram")));
            Expression expression = (Expression) parser.parse().value;
            //System.out.println(expression.toString());
            Value value = expression.Eval();
            System.out.println(value.toString());
        }
        catch (Exception e) {
            System.out.println("Exception ");
	    e.printStackTrace();
        }
	}
}
