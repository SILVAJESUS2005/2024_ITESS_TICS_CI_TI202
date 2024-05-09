/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* ÁLGEBRA LINEAL
* TI202 JLS
* 20 DE FEBRERO DEL 2024
* PROGRAMA QUE MUESTRA EL CONJUGADO DE NÚMEROS COMPLEJOS A PARTIR DE A Y B.
* jesuslopezsilva206@gmail.com
 */
package ConjugadosComplejos_AL_JLS;

import java.util.Scanner;

public class ConjugadosComplejos_AL_JLS {


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a, b;
        System.out.print("PROPORCIONE EL VALOR DE A: ");
        a = lector.nextInt();
        System.out.print("PROPORCIONE EL VALOR DE B: ");
        b = lector.nextInt();

        String salida = "EL NUMERO COMPLEJO ES: Z = ";
        if (a != 0) {
            salida += (a > 0 ? "+" : "") + a;
        }

        if (b != 0) {
            salida += (b > 0 ? "+" : "") + (b != 1 && b != -1 ? b : "") + "i";
        }

        String salida2 = "EL NUMERO CONJUGADO ES : Z' = ";
        int conjugadoB = -b;

        if (a != 0) {
            salida2 += (a > 0 ? "+" : "") + a;
        }

        if (conjugadoB != 0) {
            salida2 += (conjugadoB > 0 ? "+" : "") + 
            (conjugadoB != 1 && conjugadoB != -1 ? conjugadoB : "") + "i";
        }

        System.out.println(salida);
        System.out.println(salida2);
    }
}

//    public static void main(String[] args) {
//        Scanner lector = new Scanner(System.in);
//        int a, b;
//        System.out.print("PROPORCIONE EL VALOR DE A: ");
//        a = lector.nextInt();
//        System.out.print("PROPORCIONE EL VALOR DE B: ");
//        b = lector.nextInt();
//        
//
//        String salida = "EL NUMERO COMPLEJO ES: Z = ";
//        if (a != 0) {
//            salida += a+" ";
//        }
//        
//        if (b != 1 && b != 1 && b != -1) {
//            salida += b + "i";
//        } else if (b == 1) {
//            salida += "i";
//        } else if (b == -1) {
//            salida += "i";
//        }
//  
//        String salida2 = "EL NUMERO CONJUGADO ES : Z' = ";
//        b *= - 1 ;
//        
//        if (a != 0) {
//            salida2 += (a<0 ? "+" : "-")+a;
//  
//        }
//      
//        if (b != 1 && b != 1 && b != -1) {
//            salida2 += b + "i";
//        } else if (b == 1) {
//            salida2 += "i";
//        } else if (b == -1) {
//            salida2 += "i";
//        }
//
//        System.out.println(salida);
//        System.out.println(salida2);
//    } 
