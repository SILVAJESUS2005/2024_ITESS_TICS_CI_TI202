/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* MATEMATICAS DISCRETAS II
* TI202 JLS
* 11 DE MARZO DEL 2024
* PROGRAMA QUE IMPRIME EL DIAGRAMA DE ARBOL APARTIR DE LA ENTRADA DE DOS RECORRIDOS,
* EL IN ORDER ES OBLIGATORIO, PRE ORDER Y POS ORDER SON OPCION PARA EL SEGUNDO RECORRIDO.
* jesuslopezsilva206@gmail.com
*/
package practicas.poo; // Se define el paquete para organizar el código.

import java.util.Scanner; // Se importa la clase Scanner para facilitar la entrada de datos.

public class CODIGO_COMENTADO { // Se define la clase principal.

    public static void main(String[] args) { // Método principal, punto de entrada del programa.

        Scanner sc = new Scanner(System.in); // Se crea un objeto Scanner para la entrada del usuario.
        String IN_ORDER; // Variable para almacenar el recorrido IN ORDER.
        int OPCION; // Variable para almacenar la opción del usuario.
        String POS_ORDER; // Variable para almacenar el recorrido POS ORDER.
        String PRE_ORDER; // Variable para almacenar el recorrido PRE ORDER.

        // Se muestra información inicial y se solicita al usuario que elija la opción.
        System.out.println("DIAGRAMA DE ARBOL APARTIR DE RECORRIDOS");
        System.out.println("   Ingrese \n"
                + "1. PRE ORDER \n"
                + "2. POS ORDER \n");
        OPCION = sc.nextInt();

        // Se indica al usuario que ingrese los recorridos separados por comas.
        System.out.println("RECUERDA INGRESAR LOS RECORRIDOS SEPARADOS POR COMA (,)");

        if (OPCION == 1) { // Si la opción es 1 (PRE ORDER), se ejecuta este bloque.

            System.out.println("Ingresar el recorrido IN ORDER: ");
            IN_ORDER = sc.next(); // Se solicita al usuario el recorrido IN ORDER.
            System.out.println("Ingresar el recorrido PRE ORDER: ");
            PRE_ORDER = sc.next(); // Se solicita al usuario el recorrido PRE ORDER.
            String[] In_Order = IN_ORDER.split(","); // Se divide la cadena IN ORDER en un arreglo.
            String[] Pre_Order = PRE_ORDER.split(","); // Se divide la cadena PRE ORDER en un arreglo.
            String[][] Recorridos = new String[Pre_Order.length][In_Order.length]; // Se crea una matriz para almacenar información sobre los nodos.

            // Se imprime el recorrido IN ORDER con tabulaciones entre los nodos.
            for (int i = 0; i < In_Order.length; i++) {
                System.out.print("\t" + In_Order[i].trim());
            }
            System.out.println("\n");

            // Bucle para el recorrido PRE ORDER.
            for (int i = 0; i < Pre_Order.length; i++) {
                System.out.print(Pre_Order[i].trim()); // Se imprime el nodo actual del recorrido PRE ORDER.

                // Bucle para comparar los nodos de PRE ORDER con los de IN ORDER y construir el diagrama.
                for (int j = 0; j < Pre_Order.length; j++) {
                    if (Pre_Order[i].equals(In_Order[j])) { // Si el nodo de PRE ORDER coincide con el de IN ORDER.
                        Recorridos[i][j] = "\t" + Pre_Order[i]; // Se almacena información en la matriz.
                        System.out.print(Recorridos[i][j]); // Se imprime el nodo en la posición correspondiente.
                    } else if (Pre_Order[0].equals(In_Order[j])) { // Si es el primer nodo de PRE ORDER.
                        Recorridos[i][j] = "\t" + "."; // Se almacena información de conexión en la matriz.
                        System.out.print(Recorridos[i][j]); // Se imprime la conexión.
                    } else {
                        Recorridos[i][j] = "\t" + "|"; // Si no coincide, se almacena información de nodo vacío en la matriz.
                        System.out.print(Recorridos[i][j]); // Se imprime el nodo vacío.
                    }
                }
                System.out.print("\n"); // Se cambia de línea después de imprimir la fila.
            }

        } else if (OPCION == 2) { // Si la opción es 2 (POS ORDER), se ejecuta este bloque.

            System.out.println("Ingrese el In orden");
            IN_ORDER = sc.next(); // Se solicita al usuario el recorrido IN ORDER.
            System.out.println("Ingrese el Post orden");
            POS_ORDER = sc.next(); // Se solicita al usuario el recorrido POS ORDER.
            String[] In_Order = IN_ORDER.split(","); // Se divide la cadena IN ORDER en un arreglo.
            String[] Pos_Order = POS_ORDER.split(","); // Se divide la cadena POS ORDER en un arreglo.
            String[][] Recorridos = new String[Pos_Order.length][In_Order.length]; // Se crea una matriz para almacenar información sobre los nodos.

            // Se imprime el recorrido IN ORDER con tabulaciones entre los nodos.
            for (int i = 0; i < In_Order.length; i++) {
                System.out.print("\t" + In_Order[i].trim());
            }
            System.out.println("\n");

            // Bucle para el recorrido POS ORDER.
            for (int i = Pos_Order.length - 1; i >= 0; i--) {
                System.out.print(Pos_Order[i].trim()); // Se imprime el nodo actual del recorrido POS ORDER.

                // Bucle para comparar los nodos de POS ORDER con los de IN ORDER y construir el diagrama.
                for (int j = 0; j < Pos_Order.length; j++) {
                    if (Pos_Order[i].equals(In_Order[j])) { // Si el nodo de POS ORDER coincide con el de IN ORDER.
                        Recorridos[i][j] = "\t" + Pos_Order[i]; // Se almacena información en la matriz.
                        System.out.print(Recorridos[i][j]); // Se imprime el nodo en la posición correspondiente.
                    } else if (Pos_Order[0].equals(In_Order[j])) { // Si es el primer nodo de POS ORDER.
                        Recorridos[i][j] = "\t" + "."; // Se almacena información de conexión en la matriz.
                        System.out.print(Recorridos[i][j]); // Se imprime la conexión.
                    } else {
                        Recorridos[i][j] = "\t" + "|"; // Si no coincide, se almacena información de nodo vacío en la matriz.
                        System.out.print(Recorridos[i][j]); // Se imprime el nodo vacío.
                    }
                }
                System.out.print("\n"); // Se cambia de línea después de imprimir la fila.
            }
        }
    }
}
