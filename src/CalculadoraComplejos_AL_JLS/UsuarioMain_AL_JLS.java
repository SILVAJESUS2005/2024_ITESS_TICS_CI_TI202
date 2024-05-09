/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* ÁLGEBRA LINEAL
* TI202 JLS
* 1 DE MARZO DEL 2024
* PROGRAMA QUE MUESTRA LA SUMA Y RESTA DE NUMEROS COMPLEJOS.
* jesuslopezsilva206@gmail.com
 */
package CalculadoraComplejos_AL_JLS;

import java.util.Scanner;

public class UsuarioMain_AL_JLS {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("VALORES Z1");
        System.out.println("PROPORCIONA EL VALOR DE A: ");
        double real = lector.nextDouble();
        System.out.println("PROPORCIOAN B: ");
        double imaginario = lector.nextDouble();

        NumerosComplejos_AL_JLS Z1 = new NumerosComplejos_AL_JLS(real, imaginario);

        System.out.println("VALORES Z2");
        System.out.println("PROPORCIONA EL VALOR DE A: ");
        real = lector.nextDouble();
        System.out.println("PROPORCIOAN B: ");
        imaginario = lector.nextDouble();

        NumerosComplejos_AL_JLS Z2 = new NumerosComplejos_AL_JLS(real, imaginario);

        System.out.println("Z1 = " + Z1);
        System.out.println("Z2 = " + Z2);

        CalculadoraComplejos_AL_JLS calculos = new CalculadoraComplejos_AL_JLS();
        System.out.println("Z1 + Z2 = " + calculos.sumarComplejos(Z1, Z2));
        System.out.println("Z1 - Z2 = " + calculos.restarComplejos(Z1, Z2));
        System.out.println("Z1 / Z2 = " + calculos.dividircomplejos(Z1, Z2));
        System.out.println("Z1 * Z2 = " + calculos.multiplicarComplejos(Z1, Z2));

    }

}
