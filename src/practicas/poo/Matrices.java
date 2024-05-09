package practicas.poo;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL VALOR DE FILAS ");
        int filas = leer.nextInt();
        String[][] lista = new String[filas][3];

        for (int i = 0; i < filas; i++) {
            System.out.println("INGRESE LOS DATOS PARA LA FILA " + (i + 1));
            System.out.print("INGRESE EL NOMBRE:  ");
            lista[i][0] = leer.next();
            System.out.print("INGRESE LA EDAD:  ");
            lista[i][1] = leer.next();
            System.out.print("INGRESE LA ALTURA:  ");
            lista[i][2] = leer.next();
        }
        System.out.println("    Nombre  \t  Edad    \t  Altura  ");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(lista[i][j] + "    \t  ");
            }
            System.out.println("");
        }
    }
}
