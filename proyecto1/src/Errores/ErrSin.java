package Errores;

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
