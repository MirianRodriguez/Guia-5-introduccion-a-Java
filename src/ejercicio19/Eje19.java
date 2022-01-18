/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double valor;
        System.out.println("Ingrese un valor en euro para convertir");
        valor = leer.nextDouble();
        convertir(valor, "libra");
        convertir(valor, "dolar");
        convertir(valor, "yen");
    }
    
    public static void convertir(double valor, String moneda){
        double libra, dolar, yen;
        libra = 0.86;
        dolar = 1.28611;
        yen = 129.852;
        switch (moneda){
            case "libra":
                System.out.println(valor + " euros = " + (valor * libra) + " libras");
                break;
            case "dolar":
                System.out.println(valor + " euros = " + (valor * dolar) + " dolares");
                break;
            case "yen":
                System.out.println(valor + " euros = " + (valor * yen) + " yenes");
                break;
            default:
                System.out.println("No se pudo realizar la conversion");
        }
    }
    
}
