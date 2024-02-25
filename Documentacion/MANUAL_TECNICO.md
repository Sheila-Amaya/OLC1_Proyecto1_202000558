##  **Manual Técnico**

### 1. **Estructuras**

1. Clase Parser
    *el archivo parser.cup define la gramática de un lenguaje de programación específico y se utiliza para crear un parser que verifica si los programas escritos en ese lenguaje cumplen con las reglas sintácticas y, si es así, construye una representación estructurada del programa que puede ser procesada o traducida a otro lenguaje, como Python en este caso.*

```java
parser code
{:


    public List<String> salidas = new ArrayList<String>();
    public ArrayList<ErrSin> Errores = new ArrayList();
    public void syntax_error(Symbol s) {
        Errores.add(new ErrSin(s.value, s.left, s.right));
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {
        System.out.println("Error sintáctico irrecuperable en la Línea " + (s.left) + " Columna " + s.right + ". Componente " + s.value + " no reconocido.");
    }

    public String getErrores() {
        return Errores.stream().map(Object::toString).collect(Collectors.joining("\n-> "));
    }
:}


```

2. Clase scanner
     *Es una especificación de reglas léxicas que se utiliza para generar un analizador léxico en Java. Este analizador léxico se encarga de reconocer y clasificar los tokens en el código fuente de un programa, lo que es fundamental para el proceso de compilación o interpretación de lenguajes de programación.*

```java

%%


%{

    public ArrayList<Excepcion> Errores = new ArrayList();
    private ArrayList<TokenInfo> tokens = new ArrayList<>();
    public ArrayList<TokenInfo> getTokens() {
        return tokens;
    }


%}

%class scanner  
%public 
%cup            
%char           
%column
%full
%line           
%unicode        
%ignorecase     

 
%init{
    yyline = 1;
    yychar = 1;
%init}




```

3. clase Excepcion
    *Se utiliza para representar errores o excepciones . Permite almacenar información sobre el tipo de error, una descripción detallada y la ubicación del error (línea y columna). El método toString() proporciona una representación legible de la excepción que se puede utilizar para mostrar mensajes de error al usuario o para registrar información de errores en el programa.*
    

```java
public class Excepcion{

    public String tipo; //guardar el tipo de error
    public String descripcion; //descripcion del error
    public String linea; //linea donde se produce el error
    public String columna; //columna donde se produce el error


    public Excepcion(String tipo,String descripcion,String linea,String columna) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.linea = linea;
        this.columna = columna;
    }

        @Override
        public String toString() {
            return this.tipo + ":" + this.descripcion + "en la linea" + this.linea + "y columna " + this.columna;
        }


}

```
 
4. Clase ErrSin
    *Se utiliza para representar errores sintácticos en un programa Java. Permite almacenar información sobre el token o elemento que causó el error, así como su ubicación en el código fuente (línea y columna). El método toString() proporciona una representación legible del error sintáctico que se puede utilizar para mostrar mensajes de error al usuario o para registrar información de errores en el programa.*

```java
public class ErrSin {
    Object token;
    int linea;
    int columna;
    public ErrSin(Object token, int linea,int columna) {
        this.token = token;
        this.linea = linea;
        this.columna = columna;
    }
    public String toString() {
        return "Error Sintáctico" + (token != null ? ": Ln " + linea + ", Col " + columna : "") +
            ". Elemento: " + token;
    }
}

```