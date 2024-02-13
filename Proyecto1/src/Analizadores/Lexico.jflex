
/*1. paquete de importaciones*/
package Analizadores;
import java_cup.runtime.Symbol;

%%
/*2. COnfiguraciones para el analisis (opciones y declaraciones) */

%{

%}

//Directivas
%class scanner  // clase analizador del lexico 
%public 
%cup            //integrarse con cup
%char           //conteo de caracteres reconocidos 
%column
%full
%line           //conteo de lineas
%unicode        //tipo de codf. que acepta carat. especiales 
%ignorecase     //no importa si son mayus o mins 


//inicializar varibales-----java...  para fila y columna en 1--jflex 
%init{
    yyline = 1;
    yychar = 1;
%init}

//-----------TOKENS-----------

//Expresiones regulares
EVITAR=[ \r\t]+
DOUBLE = [0-9]+\.[0-9]+ //reconoce num con pt decimal
ENTERO = [0-9]+ //reconoce numeros enteros
ID = (\_)*[a-zA-Z][a-zA-Z0-9\_]* //dentificadores (nombres de variables, funciones, etc.) 
CADENA =  \"([^\"]|"\\\"")+\"
comentarioMultilineal = "/*" [^*]*"*"+([^/*][^*]*"*"+)*"/"
comentarioSimple = "![^\n]*"


%%
/*3.Reglas semanticas, como se exportaran simbolos y terminales al cup */ 
"program" {  System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.PROGRAM,yyline,yychar,yytext()); }
"end" {  System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.END,yyline,yychar,yytext()); }
"console" {  System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.CONSOLE,yyline,yychar,yytext()); }
"print" {  System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.PRINT,yyline,yychar,yytext()); }

";" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.PTCOMA,yyline,yychar,yytext()); }
":" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.DOS_PT,yyline,yychar,yytext()); }
"(" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.PAR_IZQ,yyline,yychar,yytext()); }
")" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.PAR_DER,yyline,yychar,yytext()); }
"::" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.ACCESO,yyline,yychar,yytext()); }
"=" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.ASIGNACION,yyline,yychar,yytext()); }
"," {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.COMA,yyline,yychar,yytext()); }

"+" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.MAS,yyline,yychar,yytext()); }
"-" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.MENOS,yyline,yychar,yytext()); }
"*" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.POR,yyline,yychar,yytext()); }
"/" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.DIV,yyline,yychar,yytext());}


\n {yychar=1;}

{EVITAR} {}
{comentarioMultilineal} {}
{comentarioSimple} {}

//Recuperar errores lexicos  
. {
    //guarda los errores lexicos
    System.out.println("Este es un error lexico: "+yytext()+ ", en la linea: "+yyline+", en la columna: "+yychar);
    //Errores.add(new Excepcion("Lexico","Caracter no valido: "+ yytext(), yyline+"", yychar+""));
}
