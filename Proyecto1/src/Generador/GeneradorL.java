/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Generador;
import java.io.File;

/**
 *
 * @author elizabeth
 */
public class GeneradorL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jflex.Main.generate(
                new File(
                        "src/Analizadores/Lexico.jflex"));
    }
}
