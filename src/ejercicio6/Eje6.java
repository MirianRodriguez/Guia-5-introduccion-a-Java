/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int valor1, valor2;
        System.out.println("Ingrese un valor entero");
        valor1 = leer.nextInt();
        System.out.println("Ingrese otro valor entero");
        valor2 = leer.nextInt();
        if (valor1 > valor2){
            System.out.println("El primer valor ingresado es mayor");
        }else{
            System.out.println("El segundo valor ingresado es mayor");
        }
    }
    
}
