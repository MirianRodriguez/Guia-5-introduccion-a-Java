/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import static ejercicio23.Eje23.llenarMatriz;
import static ejercicio23.Eje23.mostrarMatriz;
import static ejercicio23.Eje23.trasponerMatriz;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n;
        System.out.println("Ingrese la dimension de la matriz: ");
        n = leer.nextInt();
        int[][] matriz = new int[n][n];
        int[][] matrizTraspuesta = new int[n][n];
        llenarMatriz(matriz);
        System.out.println("Matriz cargada: ");
        mostrarMatriz(matriz);
        trasponerMatriz(matriz, matrizTraspuesta);
        System.out.println("Matriz traspuesta");
        mostrarMatriz(matrizTraspuesta);
        esAntisimetrica(matriz, matrizTraspuesta);
    }
    
    public static void llenarMatriz(int[][] matriz){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length;j++){  
                System.out.println("Ingrese el valor de la posicion [" + i + "," + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
    }
    
    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length;j++){   
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void trasponerMatriz(int[][] matriz, int[][] matrizTraspuesta){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length;j++){   
                matrizTraspuesta[i][j] = matriz[j][i];
            }
        }
    }
    
    public static void esAntisimetrica(int[][] matriz, int[][] matrizTraspuesta){
        boolean bandera;
        bandera = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length;j++){   
                if (matriz[i][j] != -matrizTraspuesta[i][j]){
                    bandera = false;
                }
            }
        }
        if (bandera){
            System.out.println("La matriz ingresada es antisimetrica");
        }else{
            System.out.println("La matriz ingresada NO es antisimetrica");
        }
    }
    
}
