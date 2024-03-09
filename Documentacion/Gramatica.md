```jflex

start with ini;

ini ::= PROGRAM declaraciones END PROGRAM 
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

declaracion_variable ::= VAR ":" tipo_dato "::" ID "<-" expresion END ";" 
;

declaracion_arreglo ::= ARR ":" tipo_dato "::" "@" ID "<-" "[" expresiones "]" END ";" 
;

op_aritmetica ::= VAR ":" ID:a DOUBLE "::" operacion:b END ";" 
;


funcion_estadistica ::= MEDIA "(" expresion ")"
                   | MEDIANA  "(" expresion ")"
                   | MODA     "(" expresion ")"
                   | VARIANZA "(" expresion ")"
                   | MAX      "(" expresion ")"
                   | MIN      "(" expresion ")"
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
              | expresiones "," expresion
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

funcion_graficacion ::= BAR     "(" graficaBarras EXEC BAR       END ";" ")" END ";"
                    | PIE       "(" graficaPie    EXEC PIE       END ";" ")" END ";"
                    | LINE      "(" graficaLine   EXEC LINE      END ";" ")" END ";"
                    | HISTOGRAM "(" datoHistogram EXEC HISTOGRAM END ";" ")" END ";"
;


graficaBarras ::= atributos_bar graficaBarras
                | atributos_bar 
;

graficaPie ::= atributos_pie graficaPie
             | atributos_pie
;

graficaLine ::= atributos_line graficaLine
              | atributos_line
;

datosHistogram ::= atributos_histogram datosHistogram
                 | atributos_histogram
;


atributos_bar ::= TITULO "::" tipo_dato "=" CADENA    END ";"
               | X       "::" tipo_dato "=" expresion END ";"
               | Y       "::" tipo_dato "=" expresion END ";"
               | TITULOX "::" tipo_dato "=" CADENA    END ";"
               | TITULOY "::" tipo_dato "=" CADENA    END ";"
               | LABEL   "::" tipo_dato "=" expresion END ";"
               | VALUES  "::" tipo_dato "=" expresion END ";"
;

atributos_pie ::= TITULO "::" tipo_dato "=" CADENA    END ";"
                | VALUES "::" tipo_dato "=" expresion END ";"
                | LABEL  "::" tipo_dato "=" expresion END ";"
;

atributos_line ::= TITULO "::" tipo_dato "=" CADENA    END ";"
               | X        "::" tipo_dato "=" expresion END ";"
               | Y        "::" tipo_dato "=" expresion END ";"
               | TITULOX  "::" tipo_dato "=" CADENA    END ";"
               | TITULOY  "::" tipo_dato "=" CADENA    END ";"
               | LABEL    "::" tipo_dato "=" expresion END ";"
               | VALUES   "::" tipo_dato "=" expresion END ";"
;

atributos_histogram ::= TITULO "::" tipo_dato "=" CADENA   END ";"
                    | VALUES   "::" tipo_dato "=" expresion END ";"
;


```