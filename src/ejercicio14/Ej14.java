/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int valor1, valor2, opcion;
        String bandera;
        bandera = "n";
        System.out.println("Ingrese un valor entero");
        valor1 = leer.nextInt();
        System.out.println("Ingrese otro valor entero");
        valor2 = leer.nextInt();
        do{
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion: ");
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("La suma de los valores es: " + (valor1+valor2));
                    break;
                case 2:
                    System.out.println("La suma de los valores es: " + (valor1-valor2));
                    break;
                case 3:
                    System.out.println("La suma de los valores es: " + (valor1*valor2));
                    break;
                case 4:
                    System.out.println("La suma de los valores es: " + (valor1/valor2));
                    break;
                case 5:
                    
                    System.out.println("Esta seguro que desea salir? s/n");
                    
                    bandera = leer.next();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    
            }            
        }while("n".equals(bandera));
        System.out.println("Ha elegido salir. Adios!");
    }
    
}
