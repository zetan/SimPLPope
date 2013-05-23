package lex;

import java.io.*;
import java.util.ArrayList;
import syntax.*;
import java_cup.runtime.*;
%%
%class Lexer
%unicode
%line
%column
%x C_COMMENT
%{
//these variables are defined static because they will be referenced in main, a static method
static int charCount = 0, wordCount = 0, lineCount = 0;
static java.util.List<Symbol> symbolList = new ArrayList<Symbol>();

public static void init(){}/**//* JustÎªÁË¼æÈÝÊÖÐ´°æ*/
    private Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn); 
    }
    private Symbol symbol(int type,Object value){
        return new Symbol(type,yyline,yycolumn,value);
    }

public static void main(String [] args) throws IOException
{
	//create a scanner and use the scanner's yylex function
	//if you want standard input, System.in instead of new FileReader(args[0])
	Lexer lexer = new Lexer(new FileReader("src/TestProgram"));
	lexer.yylex();
	
}
%}
%type Object //this line changes the return type of yylex into Object

digit 			= [0-9]
intvalue 		= {digit}+
letter          = [A-Za-z]
alphanumeric    = {letter}|{digit}
other_id_char   = [_]
identifier      = {letter}({alphanumeric}|{other_id_char})*

%%

if				{return symbol(sym.IF);}
then			{return symbol(sym.THEN);}
else			{return symbol(sym.ELSE);}
end				{return symbol(sym.END);}
while			{return symbol(sym.WHILE);}
do				{return symbol(sym.DO);}
let				{return symbol(sym.LET);}
in				{return symbol(sym.IN);}
nil				{return symbol(sym.NIL);}
head			{return symbol(sym.HEAD);}
tail			{return symbol(sym.TAIL);}
fst				{return symbol(sym.FST);}
snd				{return symbol(sym.SND);}
true			{return symbol(sym.TRUE);}
false			{return symbol(sym.FALSE);}
fun				{return symbol(sym.FUN);}
"->"			{return symbol(sym.ARROW);}
"="				{return symbol(sym.EQ);}
"<"				{return symbol(sym.LT);}
">"				{return symbol(sym.GT);}
"="				{return symbol(sym.EQ);}
"+"				{return symbol(sym.PLUS);}
"-"				{return symbol(sym.MINUS);}
"*"				{return symbol(sym.TIMES);}
"/"				{return symbol(sym.DIVIDE);}
and				{return symbol(sym.AND);}
or				{return symbol(sym.OR);}
"~"				{return symbol(sym.UNARY_MINUS);}
not				{return symbol(sym.NEGATION);}
"("				{return symbol(sym.LEFT_PAREN);}
")"				{return symbol(sym.RIGHT_PAREN);}
","				{return symbol(sym.COMMA);}
"::"			{return symbol(sym.APPEND);}
";"				{return symbol(sym.SEQUENCE);}
":="			{return symbol(sym.ASSIGN);}
"$"				{return symbol(sym.END_OF_PROGRAM);}
"/*"            { yybegin(C_COMMENT); }
<C_COMMENT>"*/" { yybegin(YYINITIAL); }
<C_COMMENT>.    { }
{intvalue}		{return symbol(sym.INT, Integer.parseInt(yytext()));}
{identifier}    {return symbol(sym.VAR, new String(yytext()));}
[\n]		{charCount++; lineCount++; }
[\r]		{}
.		{charCount++; }