package lex;

public enum SymType {
	INT,
	VAR,
	IF,
	THEN,
	ELSE,
	END,
	WHILE,
	DO,
	EQ,
	LT,// <
	GT,// >
	PLUS,
	MINUS,
	TIMES,	
	DIVIDE,
	AND,
	OR,
	UNARY_MINUS,
	NEGATION,
	LET,
	IN,
	LEFT_PAREN,
	RIGHT_PAREN,
	COMMA,
	APPEND, // ::
	SEQUENCE, // ;
	ASSIGN, // :=
	NIL,
	HEAD,
	TAIL,
	FST,
	SND,
	FUN,
	ARROW, // ->
	TRUE,
	FALSE,
	END_OF_PROGRAM,
};
