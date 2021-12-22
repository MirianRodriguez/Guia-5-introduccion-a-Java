/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int valor, doble, triple, raizCuadrada;
        System.out.println("Ingrese un valor entero");
        valor = leer.nextInt();
        doble = valor * 2;
        triple = valor * 3;
        raizCuadrada = (int) Math.sqrt(valor);
        System.out.println("Valor ingresado: " + valor);
        System.out.println("Doble: " + doble);
        System.out.println("Triple: " + triple);
        System.out.println("Raiz cuadrada " + raizCuadrada);
        
    }
    
}
