/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;

import java.util.Random;

/**
 *
 * @author mirod
 */
public class Eje23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        llenarMatriz(matriz);
        System.out.println("Matriz generada: ");
        mostrarMatriz(matriz);
        trasponerMatriz(matriz);
    }
    
    public static void llenarMatriz(int[][] matriz){
        Random aleatorio = new Random(234);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length;j++){   
                matriz[i][j] = aleatorio.nextInt(100-0+1)+0; 
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
    
    public static void trasponerMatriz(int[][] matriz){
        int[][] matrizTraspuesta = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length;j++){   
                matrizTraspuesta[i][j] = matriz[j][i];
            }
        }
        System.out.println("Matriz traspuesta");
        mostrarMatriz(matrizTraspuesta);
    }
    
}
