package TablaSimbolos;

public class TablaInfo {
    private String nombre;
    private String tipo;
    private String valor;
    private int linea;
    private int columna;

    public TablaInfo(String nombre, String tipo, String valor, int linea, int columna) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.linea = linea;
        this.columna = columna;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

        @Override
    public String toString() {
        return "TablaInfo{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", valor='" + valor + '\'' +
                ", linea=" + linea +
                ", columna=" + columna +
                '}';
    }

}
