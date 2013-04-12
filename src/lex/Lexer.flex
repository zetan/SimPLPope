package lex;
import java.io.*;
import java.util.ArrayList;
import syntax.*;
%%
%class Lexer
%unicode
%line
%column
%{
//these variables are defined static because they will be referenced in main, a static method
static int charCount = 0, wordCount = 0, lineCount = 0;
static java.util.List<Expression> exprList = new ArrayList<Expression>();

public static void main(String [] args) throws IOException
{
	//create a scanner and use the scanner's yylex function
	//if you want standard input, System.in instead of new FileReader(args[0])
	Lexer lexer = new Lexer(new FileReader("src/TestProgram"));
	lexer.yylex();
	System.out.println("Characters: " + charCount + " Words: " + wordCount +" Lines: " +lineCount);
}
%}
%type Object //this line changes the return type of yylex into Object

digit = [0-9]
intvalue = {digit}+



%%

{intvalue}		{System.out.println("intvalue"); exprList.add(new IntValue(yytext()))}
[\n]		{charCount++; lineCount++; }
[\r]		{}
.		{charCount++; }