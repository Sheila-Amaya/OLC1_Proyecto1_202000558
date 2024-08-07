package Grafica;
import Grafica.GraficaHistograma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DataHistograma {
    private String titulo;
    private String values;

    public static  List<Integer> valores = new ArrayList<>();
    public static  List<Integer> fbs = new ArrayList<>();
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private double[] val;   

    public void setValues(String values) {
        String[] parts = values.split(",");
        this.val = new double[parts.length];
        for (int i = 0; i < parts.length; i++) {
            val[i] = Double.parseDouble(parts[i]);
        }
    }

    public DataHistograma build() {
        return this;
    }

    @Override
    public String toString() {
        return "DataHistograma{" +
                "titulo='" + titulo + '\'' +
                ", values='" + Arrays.toString(val)  +
                '}';
    }

    public String calcularFrecuencia() {
        Map<Integer, Integer> mapaFrecuencia = new HashMap<>();
        double total = 0;
        int frecuenciaTotal = 0;
        double frecuenciaRelativaTotal = 0;
        String resultado = "";

        /*-------------*/ 

        for (double valor : val) {
            int valorEntero = (int) valor;
            mapaFrecuencia.put(valorEntero, mapaFrecuencia.getOrDefault(valorEntero, 0) + 1);
            total += valorEntero;

            // Agregar el valor y la frecuencia a las listas
            valores.add(valorEntero);
            fbs.add(mapaFrecuencia.get(valorEntero));
        }

        int totalDatos = val.length; // Obtener el número total de datos

        resultado += "\n\n\t" + this.titulo; // Imprimir el título
        resultado += "\n--------------------------------------------------------------------";
        resultado += "\nValor\tFb\tFa\tFr";
        resultado += "\n--------------------------------------------------------------------";
        double frecuenciaAcumulada = 0;
        for (Map.Entry<Integer, Integer> entrada : mapaFrecuencia.entrySet()) {
            frecuenciaAcumulada += entrada.getValue();
            double frecuenciaRelativa = ((double)entrada.getValue() / totalDatos) * 100; // Multiplicar por 100 para obtener el porcentaje
            resultado += "\n" + entrada.getKey() + "\t" + entrada.getValue() + "\t" + (int)frecuenciaAcumulada + "\t" + (int)frecuenciaRelativa + "%";
            frecuenciaTotal += entrada.getValue();
            frecuenciaRelativaTotal += frecuenciaRelativa;
        }
        resultado += "\n--------------------------------------------------------------------";
        resultado += "\nTotal\t" + (int)frecuenciaTotal + "\t" + (int)frecuenciaAcumulada + "\t" + (int)frecuenciaRelativaTotal + "%";
        return resultado;
    }

    public GraficaHistograma datosHistograma() {
        return new GraficaHistograma(this.titulo, valores, fbs);
    }
}
