/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        System.out.println("Frase ingresada en mayusculas: ");
        System.out.println(frase.toUpperCase());
        System.out.println("Frase ingresada en minusculas: ");
        System.out.println(frase.toLowerCase());

    }
    
}
