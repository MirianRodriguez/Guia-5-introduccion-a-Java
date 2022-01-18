/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int valor;
        for (int i=0; i<4; i++){
            do{
                System.out.println("Ingrese un valor entre 1 y 20");
                valor = leer.nextInt();
            }while (valor<0 || valor>20);
            System.out.print(valor);
            for(int j=0; j<valor;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
