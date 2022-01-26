/*
 Realizar un algoritmo que rellene un vector de 
tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. 
El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package ejercicio21;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rosi-PC
 */
public class Eje21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int n;
        System.out.println("Ingrese valor para la cantidad de elementos");
        n= leer.nextInt();
        int nros[] = new int[n];
        rellenarVector(nros);
        verVector(nros);
        System.out.println("Ingrese valor a buscar");
        int buscado= leer.nextInt();
        buscar(nros, buscado);
        
    }
    public static void rellenarVector(int[] nro) {
        for (int i = 0; i < nro.length; i++) {
            nro[i] = (int) (Math.random() * 10);
        }
    }
    
    public static void verVector(int[] nro) {
         for (int i = 0; i < nro.length; i++) {
            System.out.println(nro[i] + " ");
        }
    
    }
    
    public static void buscar(int[] nros,int buscado){
        int cont=0;
        for(int i= 0 ; i<nros.length; i++){
            if(nros[i]== buscado){
                System.out.println("el numero ingresado se encontro en la posicion "+i);
                cont++;
            }
        }
        if(cont>1){
            System.out.println("el nro ingresado aparecio "+cont+" veces ");
        }
    
    }
}