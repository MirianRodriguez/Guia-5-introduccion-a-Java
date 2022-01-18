/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int limite, valor, suma;
        suma = 0;
        System.out.println("Ingrese un valor limite");
        limite = leer.nextInt();
        while (suma < limite){
            System.out.println("Ingrese un valor para sumar");
            valor = leer.nextInt();
            suma += valor;
        }
        System.out.println("La suma de los valores ingresados es " + suma);
    } 
}
