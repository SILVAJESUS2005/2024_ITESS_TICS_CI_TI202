/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* POO
* TI202 JLS
* 22 DE FEBRERO DEL 2024
* PROGRAMA QUE IMPRIME EL PROMEDIO DE LOS DATOS DE UN ARREGLO.
* jesuslopezsilva206@gmail.com
 */
package practicas.poo;

import java.util.Scanner;

public class Promedio_Arreglo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE EL NUMERO DE CALIFICACIONES: ");
        int n = leer.nextInt();
        double print[] = new double[n];
        
        for (int i = 0; i < print.length; i++) {
            System.out.println("INGRESE LA CALIFICACION:  " + i );
            print[i] = leer.nextDouble();
        }
        double total = 0;

        for (int i = 0; i < print.length; i++) {

            total += print[i];

        }
        double prom;
        prom = total / print.length;
        System.out.println("EL PROMEDIO ES: " + prom);

    }
}
