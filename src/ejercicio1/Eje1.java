/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valor1, valor2, suma;
  
        System.out.println("Ingrese un valor");
        valor1 = leer.nextInt();
        System.out.println("Ingrese otro valor");
        valor2 = leer.nextInt();
        suma = valor1 + valor2;
        System.out.println("La suma de los valores ingresados es: " + suma);

        
    }
    
}
