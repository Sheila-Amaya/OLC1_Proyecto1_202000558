package Grafica;
import java.util.List; 

public class GraficaHistograma {
    private String titulo;
    private List<Integer> valor;
    private List<Integer> frecuencia; 


    public GraficaHistograma(String titulo, List<Integer> valor, List<Integer> frecuencia) {
        this.titulo = titulo;
        this.valor = valor;
        this.frecuencia = frecuencia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setValor(List<Integer> valor) {
        this.valor = valor;
    }

    public void setFrecuencia(List<Integer> frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public List<Integer> getValor() {
        return this.valor;
    }

    public List<Integer> getFrecuencia() {
        return this.frecuencia;
    }

    @Override
    public String toString() {
        return "GraficaHistograma{" +
                "titulo='" + titulo + '\'' +
                ", valor=" + valor +
                ", frecuencia=" + frecuencia +
                '}';
    }
}
