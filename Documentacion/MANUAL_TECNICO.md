##  **Manual Técnico**

### 1. **Estructuras**

1. Clase Parser:
   
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

3. clase Excepcion:
   
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
 
4. Clase Principal
   
    *Es una subclase de javax.swing.JFrame, ventana de aplicación de interfaz gráfica de usuario (GUI) que se encarga de realizar el analisis lexico y sintactico de un texto de entrada. Se lleva a cabo la inicialización de estructuras de datos, como listas para errores, tokens y una tabla de símbolos. Se crea un analizador léxico y un analizador sintáctico, donde el primero toma el texto de jTextArea1 como entrada. Se ejecuta el análisis sintáctico, recopilando errores léxicos y sintácticos, generando informes HTML correspondientes. Se recopilan tokens y se genera un informe HTML de estos. Además, se obtiene la tabla de símbolos del análisis sintáctico y se genera una tabla correspondiente. Las salidas del análisis sintáctico se recopilan y se establecen como el texto de jTextArea2. Se generan gráficos, limpiando previamente el panel de gráficos, y se gestionan excepciones, registrando errores y mostrando mensajes en caso de problemas durante el proceso.*

```java
    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {
        //------EJECUTAR------
        Analizadores.scanner scanner; //.java
        Analizadores.Sintactico parse;
        ArrayList<Excepcion> errores = new ArrayList(); //agregar errores
        ArrayList<TokenInfo> tokens = new ArrayList();
        ArrayList<TablaInfo> tabla = new ArrayList();
        
        try {

            scanner = new scanner(new BufferedReader(new StringReader(jTextArea1.getText())));
            parse = new Sintactico(scanner);
            parse.parse(); 
            
            errores.addAll(scanner.Errores);    //errores lexicos
            errores.addAll(parse.getErrores()); //errores sintacticos
            generarReporteHTML(errores);        //generar reporte de errores lexicos y sintacticos
            tokens.addAll(scanner.getTokens()); 
            generarReporteTokensHTML(tokens);   //generar reporte de tokens

            tabla = parse.getTabla();
            generarTablaSimbolos(tabla,tokens);  //generar tabla de simbolos

            String result = "";
            for (int i = 0; i < parse.salidas.size(); i++) {
                result += parse.salidas.get(i) + '\n';
            }
            this.jTextArea2.setText(result);
            
            jPanel1.removeAll();  // Limpiar el JPanel antes de generar las gráficas
            limpiarChartPanels(); // Limpiar los ChartPanel antes de generar las gráficas
            //graficas
            generarGB(parse.grB);
            generarGP(parse.grP);
            generarGL(parse.grL);
            generarHist(parse.gH);

            // Añadir todos los ChartPanel de la lista al JPanel
            for (ChartPanel cp : chartPanels) {
                jPanel1.add(cp);
            }

            jPanel1.setLayout(cardLayout);
            

        } catch (Exception ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error fatal en compilación de entrada: " + ex.getMessage());
        }
    }
```


5. Clase Aritmetica
   
 *Se encarga de realizar operaciones aritmeticas basicas como suma, resta, multiplicacion , division y modulo.*   

```java
    public static String realizarOperacion(String entrada, String operacion) {
        String[] numeros = entrada.split(",");
        if (numeros.length == 2) {
            double a = Double.parseDouble(numeros[0]);
            double b = Double.parseDouble(numeros[1]);
            double result = 0;
    
            switch (operacion) {
                                case "SUM":
                                    result = a + b;
                                    break;
                                case "RES":
                                    result = a - b;
                                    break;
                                case "MUL":
                                    result = a * b;
                                    break;
                                case "DIV":
                                    if (b != 0) {
                                        result = a / b;
                                    }else{
                                        return "Error: No se permite la división por cero.";
                                    }
                                    break;
                                case "MOD":
                                    if (b != 0) {
                                        result = a % b;
                                    }else{
                                        return "Error: No se permite la operación módulo por cero.";
                                    }
                                    break;
                            }
                    
                            return String.valueOf(result);
                        }
                    
                        return "entrada incorrecta";
                    }
                    
}
```

1. Clase Estadistica
   
   *Realiza operaciones estadisticas basicas con operaciones dispobles como media, mediana, moda, variamza, maximo y minimo.*

```java
    public static String realizarOperacion(String entrada, String operacion) {
        String[] numeros = entrada.split(",");
        if (numeros.length == 2) {
            double a = Double.parseDouble(numeros[0]);
            double b = Double.parseDouble(numeros[1]);
            double result = 0;
    
            switch (operacion) {
                                case "SUM":
                                    result = a + b;
                                    break;
                                case "RES":
                                    result = a - b;
                                    break;
                                case "MUL":
                                    result = a * b;
                                    break;
                                case "DIV":
                                    if (b != 0) {
                                        result = a / b;
                                    }else{
                                        return "Error: No se permite la división por cero.";
                                    }
                                    break;
                                case "MOD":
                                    if (b != 0) {
                                        result = a % b;
                                    }else{
                                        return "Error: No se permite la operación módulo por cero.";
                                    }
                                    break;
                            }
                    
                            return String.valueOf(result);
                        }
                    
                        return "entrada incorrecta";
                    }
                    
}
```

1. Clase Variable
   *Es una clase que maneja un conjunto de variables, donde cada variable tiene un nombre y un valor.*

```java
public class Variable {

    public static HashMap<String, String> variables = new HashMap<>(); 

    public static void asignar(String nombre, String valor) {
        variables.put(nombre, valor);
    }

    public static String obtener(String nombre) {
        return variables.get(nombre);
    }
    
}
```

8. Clase Imprimir
   
  *El propósito de este método es formatear y devolver una cadena de texto que contiene información relacionada con un identificador (id) y una expresión (exp) proporcionados como parámetros.*

```java
    public class Imprimir{
        public static String imprimirValores(String id, String exp) {
            StringBuilder sb = new StringBuilder();
                    sb.append("----------------------------------\n").append(id).append("\n");
                    sb.append("----------------------------------\n"); 
                    String[] valores = exp.split(",");
                    for (String valor : valores) {
                        sb.append(valor).append("\n");
                    }
                    return sb.toString();
                }
            }

```