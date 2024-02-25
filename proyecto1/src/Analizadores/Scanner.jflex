//lexico
/*1. paquete de importaciones*/
package Analizadores;
import java_cup.runtime.Symbol;
import Errores.Excepcion;
import java.util.ArrayList; //para errores
import Token.TokenInfo;


%%
/*2. COnfiguraciones para el analisis (opciones y declaraciones) */

%{
    //codigo de usuario, clases , variables objetos, arreglos
    public ArrayList<Excepcion> Errores = new ArrayList();

    // Lista para almacenar los tokens
    private ArrayList<TokenInfo> tokens = new ArrayList<>();

    // Método para obtener la lista de tokens
    public ArrayList<TokenInfo> getTokens() {
        return tokens;
    }


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
comentarioMultilineal = 
comentarioSimple = 



%%

/*3.Reglas semanticas, como se exportaran simbolos y terminales al cup */ 

"program" {TokenInfo token = new TokenInfo(yytext(), "PROGRAM", yyline, yychar);  tokens.add(token); return new Symbol(sym.PROGRAM,yyline,yychar,yytext());} 
"end" {TokenInfo token = new TokenInfo(yytext(), "END", yyline, yychar);  tokens.add(token); return new Symbol(sym.END,yyline,yychar,yytext());}
"console" {TokenInfo token = new TokenInfo(yytext(), "CONSOLE", yyline, yychar);  tokens.add(token); return new Symbol(sym.CONSOLE,yyline,yychar,yytext());}
"print" {TokenInfo token = new TokenInfo(yytext(), "PRINT", yyline, yychar);  tokens.add(token); return new Symbol(sym.PRINT,yyline,yychar,yytext());}



{CADENA} {TokenInfo token = new TokenInfo(yytext(), "CADENA", yyline, yychar); tokens.add(token); return new Symbol(sym.CADENA, yyline, yychar, yytext()); }

";" {TokenInfo token = new TokenInfo(yytext(), "PT_COMA", yyline, yychar); tokens.add(token); return new Symbol(sym.PTCOMA,yyline,yychar, yytext());} 
":" {TokenInfo token = new TokenInfo(yytext(), "DOS_PT", yyline, yychar);  tokens.add(token); return new Symbol(sym.DOS_PT,yyline,yychar, yytext());} 
"(" {TokenInfo token = new TokenInfo(yytext(), "PAR_IZQ", yyline, yychar);  tokens.add(token); return new Symbol(sym.PAR_IZQ,yyline,yychar, yytext());} 
")" {TokenInfo token = new TokenInfo(yytext(), "PAR_DER", yyline, yychar);  tokens.add(token); return new Symbol(sym.PAR_DER,yyline,yychar, yytext());} 
"}" {TokenInfo token = new TokenInfo(yytext(), "LLAVE_DER", yyline, yychar);  tokens.add(token); return new Symbol(sym.LLAV_DER,yyline,yychar, yytext());} 
"{" {TokenInfo token = new TokenInfo(yytext(), "LLAVE_IZQ", yyline, yychar);  tokens.add(token); return new Symbol(sym.LLAV_IZQ,yyline,yychar, yytext());} 
"." {TokenInfo token = new TokenInfo(yytext(), "PUNTO", yyline, yychar);  tokens.add(token); return new Symbol(sym.PT,yyline,yychar, yytext());} 
"[" {TokenInfo token = new TokenInfo(yytext(), "COR_IZQ", yyline, yychar);  tokens.add(token); return new Symbol(sym.COR_IZQ,yyline,yychar, yytext());} 
"]" {TokenInfo token = new TokenInfo(yytext(), "COR_DER", yyline, yychar);  tokens.add(token); return new Symbol(sym.COR_DER,yyline,yychar, yytext());} 
"::" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.ACCESO,yyline,yychar,yytext()); }
"=" {System.out.println("Reconocio PR: "+yytext()); return new Symbol(sym.ASIGNACION,yyline,yychar,yytext()); }
"," {TokenInfo token = new TokenInfo(yytext(), "COMA", yyline, yychar);  tokens.add(token); return new Symbol(sym.COMA,yyline,yychar, yytext());} 
"$" {TokenInfo token = new TokenInfo(yytext(), "S", yyline, yychar);  tokens.add(token); return new Symbol(sym.S,yyline,yychar,yytext());}


"+" {TokenInfo token = new TokenInfo(yytext(), "MAS", yyline, yychar); tokens.add(token); return new Symbol(sym.MAS,yyline,yychar, yytext());} 
"-" {TokenInfo token = new TokenInfo(yytext(), "MENOS", yyline, yychar); tokens.add(token); return new Symbol(sym.MENOS,yyline,yychar, yytext());} 
"*" {TokenInfo token = new TokenInfo(yytext(), "POR", yyline, yychar); tokens.add(token); return new Symbol(sym.POR,yyline,yychar, yytext());} 
"/" {TokenInfo token = new TokenInfo(yytext(), "DIV", yyline, yychar); tokens.add(token); return new Symbol(sym.DIV,yyline,yychar, yytext());}


{ENTERO} {TokenInfo token = new TokenInfo(yytext(), "ENTERO", yyline, yychar); tokens.add(token); return new Symbol(sym.ENTERO,yyline,yychar,yytext());}
{DOUBLE} {TokenInfo token = new TokenInfo(yytext(), "DOUBLE", yyline, yychar); tokens.add(token);return new Symbol(sym.DOUBLE,yyline,yychar,yytext());}
{ID} {TokenInfo token = new TokenInfo(yytext(), "ID", yyline, yychar); tokens.add(token); return new Symbol(sym.ID,yyline,yychar,yytext());}


\n {yychar=1;}

{EVITAR} {}
{comentarioMultilineal} {}
{comentarioSimple} {}

//Recuperar errores lexicos  
. {
    //guarda los errores lexicos
    //System.out.println("Este es un error lexico: "+yytext()+ ", en la linea: "+yyline+", en la columna: "+yychar);
    Errores.add(new Excepcion("Lexico","Caracter no valido: "+ yytext(), yyline+"", yychar+""));
}
