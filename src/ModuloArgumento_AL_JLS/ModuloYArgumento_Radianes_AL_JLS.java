/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* CALCULO LINEAL
* TI202 JLS
* 16 DE FEBRERO DEL 2024
* PROGRAMA QUE CALCULA EL MODULO Y EL ARGUMENTO DE UN NUMERO COMPLEJO , DADOS LOS VALORES DE A Y B.
* jesuslopezsilva206@gmail.com
 */
package ModuloArgumento_AL_JLS;

import java.util.Scanner;

public class ModuloYArgumento_Radianes_AL_JLS {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("PROPORCIONA EL VALOR DE 'A': ");
        double a = lector.nextDouble();
        System.out.println("PROPORCIONA EL VALOR DE 'B': ");
        double b = lector.nextDouble();

        double modulo, argumento;
        if (a == 0) {//EL NÚMERO COMPLEJO ESTA EN EL EJE VERTICAL
            modulo = Math.abs(b);
            modulo = b;

            argumento = (b < 0 ? 270 : 90);

        } else if (b == 0) {
            modulo = a;

            argumento = (a < 0 ? 180 : 0);

        } else {
            if (a > 0 && b > 0) {   //CUADRANTE I
                argumento = (double) Math.atan(Math.abs(b / a));

            } else if (a < 0 && b > 0) {   //CUADRANTE II
                argumento = 180 - (double) Math.atan(Math.abs(b / a));

            } else if (a < 0 && b < 0) {   //CUADRANTE III
                argumento = 180 + (double) Math.atan(Math.abs(b / a));

            } else {   //CUADRANTE IV
                argumento = 360 - (double) Math.atan(Math.abs(b / a));

            }
            modulo = (int) Math.sqrt(a*a + b*b);

        }
        System.out.println("Modulo: "+modulo);
                System.out.println("Argumento: "+argumento);

    }
}
