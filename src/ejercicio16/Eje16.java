/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String FDE,cadena;
        int correctas, incorrectas;
        correctas = 0;
        incorrectas = 0;
        FDE = "&&&&&";
        do {
            System.out.println("Ingrese una cadena de 5 caracteres que comience con X y termine con O");
            cadena = leer.nextLine();
            if (cadena.length()==5 && cadena.substring(0,1).equalsIgnoreCase("X") && cadena.substring(4, 5).equalsIgnoreCase("O")){
                System.out.println("Correcto");
                correctas++;
            }else if (!cadena.equals(FDE)){
                System.out.println("Incorrecto");
                incorrectas++;
            }else{
                break;
            }
        } while (!cadena.equals(FDE));
        System.out.println("Correctas: " + correctas + ", Incorrectas: " + incorrectas);
        
    }
    
}
