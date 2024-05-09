/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fdp;
    import java.util.Scanner;
/**
 *
 * @author Jesus López Silva 
 * Fecha: 27/11/23
 * DESCRIPCIÓN: Ingresar una cadena de texto y te diga la cantidad de caracteres.
 */
public class Cadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = sc.nextLine();

        // Calcular la longitud de la cadena
        int longitud = cadena.length();

        // Mostrar la cantidad de caracteres en la cadena
        System.out.println("La cadena tiene " + longitud + " caracteres.");

        sc.close();
    }
}


