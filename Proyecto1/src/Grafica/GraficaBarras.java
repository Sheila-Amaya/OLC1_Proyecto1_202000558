package Grafica;

import java.util.ArrayList;
import java.util.Arrays;

public class GraficaBarras {
    private String titulo;
    private String ejeX;
    private String ejeY;
    private String tituloX;
    private String tituloY;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String[] ejeXValues;

    public String[] setEjeX(String ejeX) {
        this.ejeXValues = ejeX.split(",");
        return this.ejeXValues;
    }

    private double[] ejeYValues;

    public void setEjeY(String ejeY) {
        String[] parts = ejeY.split(",");
        this.ejeYValues = new double[parts.length];
        for (int i = 0; i < parts.length; i++) {
            this.ejeYValues[i] = Double.parseDouble(parts[i]);
        }
    }

    public void setTituloX(String tituloX) {
        this.tituloX = tituloX;
    }

    public void setTituloY(String tituloY) {
        this.tituloY = tituloY;
    }

    // Método que retorna el objeto con todos sus atributos
    public GraficaBarras build() {
        return this;
    }

    // Método para imprimir los datos del objeto
    @Override
    public String toString() {
        return "GraficaBarras{" +
                "titulo='" + titulo + '\'' +
                ", tituloX='" + tituloX + '\'' +
                ", tituloY='" + tituloY + '\'' +
                ", ejeXValues=" + Arrays.toString(ejeXValues) +
                ", ejeYValues=" + Arrays.toString(ejeYValues) +
                '}';
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public String getTituloX() {
        return this.tituloX;
    }

    public String getTituloY() {
        return this.tituloY;
    }

    public String[] getEjeXValues() {
        return this.ejeXValues;
    }

    public double[] getEjeYValues() {
        return this.ejeYValues;
    }

}
