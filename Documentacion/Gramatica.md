```jflex

start with ini;

ini ::= PROGRAM declaraciones:a END PROGRAM 
;

declaraciones ::= declaraciones declaracion
               | declaracion
               | error
;

declaracion ::= imprimir
             | declaracion_variable
             | declaracion_arreglo
             | op_aritmetica
             | funcion_graficacion

;

imprimir ::= CONSOLE "::" PRINT "=" expresiones:e END ";" 
            | CONSOLE "::" COLUMN "=" expresiones "->" expresiones END ";"
;

declaracion_variable ::= VAR ":" tipo_dato "::" ID INICIALIZACION expresion END ";" 
;

declaracion_arreglo ::= ARR ":" tipo_dato "::" "@" ID INICIALIZACION "[" expresiones "]" END ";" 
;


op_aritmetica ::= VAR ":" ID:a DOUBLE "::" operacion:b END ";" 
;


funcion_estadistica ::= MEDIA "(" expresion ")"
                   | MEDIANA "(" expresion ")"
                   | MODA "(" expresion ")"
                   | VARIANZA "(" expresion ")"
                   | MAX "(" expresion ")"
                   | MIN "(" expresion ")"
; 


funcion_graficacion ::= tipo_grafica "(" atributos_grafica EXEC tipo_grafica END ";" ")" END ";"
;

tipo_grafica ::= BAR
                |PIE
                |LINE
                |HISTOGRAM
;

atributos_grafica ::= atributos                               
;


atributos ::= TITULO "::" tipo_dato "=" CADENA END ";"
               | X "::" tipo_dato expresion END ";"
               | Y "::" tipo_dato expresion END ";"
               | TITULOX "::" tipo_dato "=" CADENA END ";"
               | TITULOY "::" tipo_dato "=" CADENA END ";"
               | LABEL "::" tipo_dato "=" expresion END ";"
               | VALUES "::" tipo_dato "=" expresion END ";"
;



expresion ::= operacion
           | ID
           | CADENA
           | NUMERO
           | "(" expresion ")"
           | funcion_estadistica
           | "[" expresiones "]"
           | "@" ID
;

expresiones ::= expresion
              | expresiones COMA expresion
;


tipo_dato ::= DOUBLE
            | CHAR_ARRAY
;


operacion ::= SUM "(" expresiones ")"
            | RES "(" expresiones ")"
            | MUL "(" expresiones ")"
            | DIV "(" expresiones ")"
            | MOD "(" expresiones ")"
;


```