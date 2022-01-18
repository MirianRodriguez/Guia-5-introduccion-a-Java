/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int nota;
        do {
            System.out.println("Ingrese una nota");
            nota = leer.nextInt();
        } while(nota < 0 || nota > 10);
        System.out.println("La nota ingresada es " + nota);
    }
    
}
