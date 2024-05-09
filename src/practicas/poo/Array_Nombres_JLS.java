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

public class Array_Nombres_JLS {

    public static void main(String[] args) {
        String[] nombres = {"Juan", "Nicolas", "Charlee", "Bruno", "Cristian", "Sandra", "Vannesa", "Evelyn", "Isabel", "Lizeth", "Valeria", "Josue", "Stiven", "Patricio", "Brandy", "Fernando"};

        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]+", ");
        }

        for (int i = 0; i<nombres.length; i++) {
            System.out.println(nombres[i]);
        }

    }

}
