/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* POO
* TI202 JLS
* 22 DE FEBRERO DEL 2024
* PROGRAMA QUE IMPRIME DATOS DE UN ARREGLO AL AZAR.
* jesuslopezsilva206@gmail.com
 */
package practicas.poo;

import java.util.Random;


public class Arreglo_DatosAzar {
       public static void main(String[] args) {
        String[] nombres = {"Juan", "Nicolas", "Charlee", "Bruno", "Cristian", "Sandra", "Vannesa", "Evelyn", "Isabel", "Lizeth", "Valeria", "Josue", "Stiven", "Patricio", "Brandy", "Fernando"};
        Random random = new Random();
        
           System.out.println("LOS NOMBRES ALEATORIOS SON: ");
           
           for (int i=1; i<=3; i++){
               int NumerosRandoms = random.nextInt(16);
               System.out.print(nombres[NumerosRandoms]+ "  ");
           }
           System.out.println("");
       }
}
