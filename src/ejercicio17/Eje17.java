/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n;
        System.out.println("Ingrese dimension del cuadrado");
        n = leer.nextInt();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
