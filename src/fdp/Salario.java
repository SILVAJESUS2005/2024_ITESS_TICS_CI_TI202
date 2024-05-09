package fdp;

import java.util.Scanner;

/**
 * *PRACTICA 3: SALARIO
 *
 * @author Jesús López Silva 27-11-2023 DESCRIPCIÓN: EL SIGUIENTE PROGRAMA
 * REALIZA BONUS A TU SALARIO DE ACUERDO A TU EDAD PUEDAN SSER DEL 5, 10 O HASTA
 * 15 PORCIENTO MAS, DE TU SALARIO.
 */
public class Salario {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        double salario, salario1;
        System.out.println("Ingresa tu NOMBRE");
        nombre = leer.nextLine();
        System.out.println("Ingresa tu EDAD");
        edad = leer.nextInt();
        System.out.println("Ingresa tu SALARIO");
        salario = leer.nextDouble();
        if (edad < 16) {
            salario1 = salario;
            System.out.println("NO PUEDES TRABAJAR");
        } else if (edad >= 19 && edad <= 50) {
            salario1 = (salario * 0.05) + salario;
            System.out.println("El salario es: " + salario1);
        } else if (edad >= 51 && edad <= 60) {
            salario1 = (salario * 0.10) + salario;
            System.out.println("El salario es: " + salario1);
        } else if (edad > 60) {
            salario1 = (salario * 0.15) + salario;
            System.out.println("El salario es: " + salario1);
        } else {
            System.out.println("El salario es: " + salario);
        }

    }

}
