package practicas.poo;

import java.util.Scanner;

public class PRACTIC_MATRICES_JLS {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL VALOR DE FILAS ");
        int filas = leer.nextInt();
        int x = 3;
        String[][] lista = new String[x][filas];
        lista[0][0] = "NOMBRE";
        lista[1][0] = "EDAD";
        lista[2][0] = "ALTURA";

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i == 0) {
                    System.out.print("INGRESE EL NOMBRE:  ");
                    lista[j][i] = leer.next();
                    System.out.print("INGRESE LA EDAD:  ");
                    lista[j][i] = leer.next();
                    System.out.print("INGRESE LA ALTURA:  ");
                    lista[j][i] = leer.next();
                }
                if (i == 1) {
                    System.out.print("INGRESE EL NOMBRE:  ");
                    lista[j][i] = leer.next();
                    System.out.print("INGRESE LA EDAD:  ");
                    lista[j][i] = leer.next();
                    System.out.print("INGRESE LA ALTURA:  ");
                    lista[j][i] = leer.next();

                }
                if (i == 2) {
                    System.out.print("INGRESE EL NOMBRE:  ");
                    lista[j][i] = leer.next();
                    System.out.print("INGRESE LA EDAD:  ");
                    lista[j][i] = leer.next();
                    System.out.print("INGRESE LA ALTURA:  ");
                    lista[j][i] = leer.next();

                }

            }

        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(lista[j][i] + "\t");
            }
            System.out.println("");
        }

    }
}
