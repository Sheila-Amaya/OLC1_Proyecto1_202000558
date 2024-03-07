package Grafica;

import java.util.Map;

public class Resultado {
    private String titulo;
    private Map<Integer, Integer> datosGrafica;

    public Resultado(String titulo, Map<Integer, Integer> datosGrafica) {
        this.titulo = titulo;
        this.datosGrafica = datosGrafica;
    }

    public String getTitulo() {
        return titulo;
    }

    public Map<Integer, Integer> getDatosGrafica() {
        return datosGrafica;
    }
    
}
