/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String cadena;
        System.out.println("Ingrese una frase que empiece con A");
        cadena = leer.nextLine();
        if(cadena.substring(0,1).equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
