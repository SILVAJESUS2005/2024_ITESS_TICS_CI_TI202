/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* ÁLGEBRA LINEAL
* TI202 JLS
* 23 DE FEBRERO DEL 2024
* PROGRAMA QUE CALCULA EL MODULO Y EL ARGUMENTO APARTIR DE LOS VALORES A Y B.
* jesuslopezsilva206@gmail.com
 */
package ModuloArgumento_AL_JLS;

import java.util.Scanner;

public class ModuloyArgumento_Grados_AL_JLS {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("PROPORCIONA EL VALOR DE 'A': ");
        double a = lector.nextDouble();
        System.out.println("PROPORCIONA EL VALOR DE 'B': ");
        double b = lector.nextDouble();

        double modulo;
        int argumento;
        if (a == 0) {//EL NÚMERO COMPLEJO ESTA EN EL EJE VERTICAL
            modulo = Math.abs(b);
            argumento = (b < 0 ? 270 : 90);

        } else if (b == 0) {
            modulo = a;
            argumento = (a < 0 ? 180 : 0);

        } else {
                        modulo = (double) Math.sqrt(a * a + b * b);

            double radianArgumento = Math.atan2(b, a);
            argumento = (int) Math.toDegrees(radianArgumento);
            if (argumento < 0) {
                argumento += 360;
            }
        }
        System.out.println("Modulo: " + modulo);
        System.out.println("Argumento: " + argumento + " grados");
    }
}


