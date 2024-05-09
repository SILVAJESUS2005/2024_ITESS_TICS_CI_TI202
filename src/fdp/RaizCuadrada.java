/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fdp;

import java.util.Scanner;

/**
 *PRACTICA 6: RAIZ CUADRADA
 * @author Jesus Lopez Silva
 * DEFINICION DEL PROGRAMA: Ingresar un numero y obetener raiz cuadrada de este utilizando
 * la funcion Math.sqrt.
 */
public class RaizCuadrada {
       public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
           System.out.println("Ingrese un número: ");
           double numero=leer.nextDouble();
           while (numero<0){
               System.out.println("Número no valido");
               System.out.println("Ingrese un número");
               numero=leer.nextDouble();
               
           }
           double resultado = Math.sqrt(numero);
           System.out.println(resultado);
}
}