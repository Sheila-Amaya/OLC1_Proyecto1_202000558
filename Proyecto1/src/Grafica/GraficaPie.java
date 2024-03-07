package Grafica;

import java.util.Arrays;

public class GraficaPie {
    private String titulo;
    private String values;
    private String label;

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

    private String[] labelValues;

    public String[] setLabel(String label) {
        this.labelValues = label.split(",");
        return this.labelValues;
    }

    public GraficaPie build() {
        return this;
    }

    @Override
    public String toString() {
        return "GraficaPie{" +
                "titulo='" + titulo + '\'' +
                ", values='" + Arrays.toString(val) +
                ", label='"  + Arrays.toString(labelValues) +
                '}';
    }

    public String getTitulo() {
        return this.titulo;
    }

    public double[] getValues() {
        return this.val;
    }

    public String[] getLabel() {
        return this.labelValues;
    }
}
