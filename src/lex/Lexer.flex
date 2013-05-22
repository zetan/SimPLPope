package lex;

import java.io.*;
import java.util.ArrayList;
import syntax.*;
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



public static void main(String [] args) throws IOException
{
	//create a scanner and use the scanner's yylex function
	//if you want standard input, System.in instead of new FileReader(args[0])
	Lexer lexer = new Lexer(new FileReader("src/TestProgram"));
	lexer.yylex();
	for(Symbol symbol : symbolList) symbol.Print();
	
	System.out.println("Characters: " + charCount + " Words: " + wordCount +" Lines: " +lineCount);
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

if				{symbolList.add( new Symbol(SymType.IF, yyline));}
then			{symbolList.add( new Symbol(SymType.THEN, yyline));}
else			{symbolList.add( new Symbol(SymType.ELSE, yyline));}
end				{symbolList.add( new Symbol(SymType.END, yyline));}
while			{symbolList.add( new Symbol(SymType.WHILE, yyline));}
do				{symbolList.add( new Symbol(SymType.DO, yyline));}
let				{symbolList.add( new Symbol(SymType.LET, yyline));}
in				{symbolList.add( new Symbol(SymType.IN, yyline));}
nil				{symbolList.add( new Symbol(SymType.NIL, yyline));}
head			{symbolList.add( new Symbol(SymType.HEAD, yyline));}
tail			{symbolList.add( new Symbol(SymType.TAIL, yyline));}
fst				{symbolList.add( new Symbol(SymType.FST, yyline));}
snd				{symbolList.add( new Symbol(SymType.SND, yyline));}
true			{symbolList.add( new Symbol(SymType.TRUE, yyline));}
false			{symbolList.add( new Symbol(SymType.FALSE, yyline));}
fun				{symbolList.add( new Symbol(SymType.FUN, yyline));}
"->"			{symbolList.add( new Symbol(SymType.ARROW, yyline));}
"="				{symbolList.add( new Symbol(SymType.EQ, yyline));}
"<"				{symbolList.add( new Symbol(SymType.LT, yyline));}
">"				{symbolList.add( new Symbol(SymType.GT, yyline));}
"="				{symbolList.add( new Symbol(SymType.EQ, yyline));}
"+"				{symbolList.add( new Symbol(SymType.PLUS, yyline));}
"-"				{symbolList.add( new Symbol(SymType.MINUS, yyline));}
"*"				{symbolList.add( new Symbol(SymType.TIMES, yyline));}
"/"				{symbolList.add( new Symbol(SymType.DIVIDE, yyline));}
and				{symbolList.add( new Symbol(SymType.AND, yyline));}
or				{symbolList.add( new Symbol(SymType.OR, yyline));}
"~"				{symbolList.add( new Symbol(SymType.UNARY_MINUS, yyline));}
not				{symbolList.add( new Symbol(SymType.NEGATION, yyline));}
"("				{symbolList.add( new Symbol(SymType.LEFT_PAREN, yyline));}
")"				{symbolList.add( new Symbol(SymType.RIGHT_PAREN, yyline));}
","				{symbolList.add( new Symbol(SymType.COMMA, yyline));}
"::"			{symbolList.add( new Symbol(SymType.APPEND, yyline));}
";"				{symbolList.add( new Symbol(SymType.SEQUENCE, yyline));}
":="			{symbolList.add( new Symbol(SymType.ASSIGN, yyline));}
"$"				{symbolList.add( new Symbol(SymType.END_OF_PROGRAM, yyline));}
"/*"            { yybegin(C_COMMENT); }
<C_COMMENT>"*/" { yybegin(YYINITIAL); }
<C_COMMENT>.    { }
{intvalue}		{symbolList.add( new Symbol(SymType.INT, Integer.parseInt(yytext()), yyline));}
{identifier}    {symbolList.add( new Symbol(SymType.VAR, new String(yytext()), yyline));}
[\n]		{charCount++; lineCount++; }
[\r]		{}
.		{charCount++; }