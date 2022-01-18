/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String cadena;
        System.out.println("Ingrese una cadena de texto de 8 caracteres");
        cadena = leer.nextLine();
        if(cadena.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
