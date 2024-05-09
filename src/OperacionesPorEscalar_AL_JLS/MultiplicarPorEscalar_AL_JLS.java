package OperacionesPorEscalar_AL_JLS;

import java.util.Scanner;

public class MultiplicarPorEscalar_AL_JLS {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL ESCALAR");
        int escalar = leer.nextInt();
        System.out.println("Ingrese la cantidad de filas de la matriz");
        int filas = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz");
        int columnas = leer.nextInt();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.println("INGRESE LOS DATOS DE LA FILA: " + (i + 1));
                matriz[i][j] = leer.nextInt();
            }
        }
        int[][] resultado = MultiplicarEscalar(matriz, escalar);

        System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: ");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println("");
        }

    }

    public static int[][] MultiplicarEscalar(int[][] matriz, int escalar) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }
        return resultado;
    }
}
