/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* POO
* TI202 JLS
* 22 DE FEBRERO DEL 2024
* PROGRAMA QUE IMPRIME UN ARREGLO EN FORMA VERTICAL Y HORIZONTAL.
* jesuslopezsilva206@gmail.com
 */
package practicas.poo;

import java.util.Scanner;

public class Array_nElementos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE EL NUMERO DE ELEMENTOS DEL ARREGLO");
        int n = leer.nextInt();
        String print[] = new String[n];

        for (int i = 0; i < print.length; i++) {
            System.out.println("INGRESE EL " + i + " DATO");
            print[i] = leer.next();
        }

        for (int i = 0; i < print.length; i++) {
            System.out.print(print[i] + "  ");
        }

    }
}
