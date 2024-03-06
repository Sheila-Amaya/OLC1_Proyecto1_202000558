package Instruccion;

import java.util.LinkedList;

public class Aritmetica {

    public static LinkedList<Object> aritmetica = new LinkedList<>();

    public static String sumArit(String a, String b) {
        return String.valueOf(Double.parseDouble(a) + Double.parseDouble(b));
    }

    public static String resArit(String a, String b) {
        return String.valueOf(Double.parseDouble(a) - Double.parseDouble(b));
    }

    public static String mulArit(String a, String b) {
        return String.valueOf(Double.parseDouble(a) * Double.parseDouble(b));
    }

    public static String divArit(String a, String b) {
        return String.valueOf(Double.parseDouble(a) / Double.parseDouble(b));
    }

    public static String modArit(String a, String b) {
        return String.valueOf(Double.parseDouble(a) % Double.parseDouble(b));
    }
}

