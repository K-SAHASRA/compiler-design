%option noyywrap
%{
	#include<stdio.h>
%}
letter [a-zA-z]
digit[0-9]
relop <|<=|>|>=|=|#
%%
if|then|while {printf("\n%s:keywords",yytext);}
{letter} ({letter}|{digit})* {printf("\n%s:variables",yytext);}
. {printf("\n%s:other",yytext);}
\n {return 0;}


%%
int main()
{
	yylex();
	return 0;
}