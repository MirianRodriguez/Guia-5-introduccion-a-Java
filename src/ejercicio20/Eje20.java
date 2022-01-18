/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

/**
 *
 * @author mirod
 */
public class Eje20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        llenarVector(vector);
        mostrarVector(vector);
    }
    
    public static void llenarVector(int[] vector){
        for (int i=0; i<vector.length; i++){
            vector[i] = i;
        }
    }
    
    public static void mostrarVector(int[] vector){
        for (int i=vector.length-1; i>=0; i--){
            System.out.println(vector[i]);
        }
    }
    
}
