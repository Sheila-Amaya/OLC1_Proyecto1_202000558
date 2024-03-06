package Instruccion;
import java.util.HashMap;
import java.util.List;
import Instruccion.Variable;
import Instruccion.Imprimir;
import java.util.ArrayList;

/**
 * Imprimir
 */

    public class Imprimir {
        
        public static HashMap<String, String> variables = new HashMap<>();
        
        public static void imprimirVariables(List<String> exp) {
            for (String expr : exp) {
                if (variables.containsKey(expr)) {
                    System.out.println("Variable: " + expr + " Valor: " + variables.get(expr));
                }
            }
        }       
    }