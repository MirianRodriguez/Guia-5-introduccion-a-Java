/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int suma, valor, i;
        suma = 0;
        i=0;
        while (i<20){
            System.out.println("Ingrese un valor entero: ");
            valor = leer.nextInt();
            if (valor == 0){
                System.out.println("Se capturó el número 0");
                break;
            }else if (valor > 0){
                suma += valor;
            }
            i++;
        }
        System.out.println("La suma de los valores positivos ingresados es: " + suma);

    }
    
}
