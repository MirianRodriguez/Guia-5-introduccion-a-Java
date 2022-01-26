/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n;
        System.out.println("Ingrese la longitud del vector: ");
        n = leer.nextInt();
        int[] vector = new int[n];
        cargarVector(vector);
        System.out.println("Vector generado: ");
        mostrarVector(vector);
        clasificarNumeros(vector);
    }
    
    public static void cargarVector(int[] vector) {
        Random aleatorio = new Random(234);
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(10000-0+1)+0; //numeros de hasta 5 cifras
        }
    }
    
    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " ");
        }
    }
    
    public static void clasificarNumeros(int[] vector){
        String numeroString;
        int un, dos, tres, cuatro, cinco;
        un = 0;
        dos = 0;
        tres = 0;
        cuatro = 0;
        cinco = 0;
        for (int i = 0; i < vector.length; i++) {
            numeroString = Integer.toString(vector[i]);
            switch (numeroString.length()){
                case 1:
                    un++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
            }
        }
        System.out.println("La cantidad de elementos del vector es: " + vector.length);
        System.out.println("Numeros de un digito: " + un);
        System.out.println("Numeros de dos digitos: " + dos);
        System.out.println("Numeros de tres digitos: " + tres);
        System.out.println("Numeros de cuatro digitos: " + cuatro);
        System.out.println("Numeros de cinco digitos: " + cinco);
    }
}
