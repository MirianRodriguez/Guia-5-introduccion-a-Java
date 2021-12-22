/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double tempCentigrados, tempFahrenheit;
        System.out.println("Ingrese la temperatura en grados centigrados");
        tempCentigrados= leer.nextDouble(); 
        tempFahrenheit = 32 + (9 * tempCentigrados / 5);
        System.out.println("La temperatura ingresada fue " + tempCentigrados + "° C");
        System.out.println("El equivalente es " + tempFahrenheit + "° F");
    }   
}
