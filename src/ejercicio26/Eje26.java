/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        int[][] p = new int[3][3];
        System.out.println("A continuacion cargue la matriz m");
        llenarMatriz(m);
        System.out.println("A continuacion cargue la matriz p");
        llenarMatriz(p);
        System.out.println("Matriz cargada: ");
        mostrarMatriz(m);
        System.out.println("Submatriz a buscar: ");
        mostrarMatriz(p);
        buscarSubmatriz(m, p);
    }

    public static void llenarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese el valor de la posicion [" + i + "," + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void buscarSubmatriz(int[][] m, int[][] p) {
        //para saber si la subm se encontro
        boolean encontrado;
        encontrado = false;
        //para guardar la posicion en que se encuentra la subm
        int fila, columna;
        fila = -1;
        columna = -1;
        //recorre la matriz buscando el primer valor de la submatriz
        for (int i = 0; i < m.length - 2; i++) {
            for (int j = 0; j < m[0].length - 2; j++) {
                if (!encontrado) {
                    //si hay coincidencia con el primer valor de la subm
                    if (m[i][j] == p[0][0]) {
                        //indices para recorrer la submatriz (p)
                        int ip, jp;
                        ip = 0;
                        //jp = 0;
                        //presumo que encontre la subm y guardo la posicion inicial
                        encontrado = true;
                        fila = i;
                        columna = j;
                        //recorre la matriz (m) desde donde estaba, 3 filas y columnas
                        for (int f = i; f < i + 2; f++) {
                            jp = 0;
                            for (int c = j; c < j + 2; c++) {
                                //comparo con cada elemento de p, si alguno es distinto, no encontro la subm
                                if (m[f][c] != p[ip][jp]) {
                                    encontrado = false;
                                    fila = -1;
                                    columna = -1;
                                }
                                jp++;
                            }
                            ip++;
                        }
                    }
                }
            }
        }
        //muestro los resultados
        if (encontrado) {
            System.out.println("La submatriz fue encontrada en la posicion: [" + fila + "," + columna + "]");
        } else {
            System.out.println("La submatriz no fue encontrada.");
        }
    }

}
