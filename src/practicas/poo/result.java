
package practicas.poo;

import java.util.Scanner;
class result {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el número de columnas fijo
        int numColumnas = 4;

        // Pedir al usuario que ingrese el número de filas
        System.out.print("Ingrese el numero de filas: ");
        int numFilas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear el arreglo bidimensional
        String[][] arregloBidimensional = new String[numFilas][numColumnas];

        // Leer las filas e ingresar datos al arreglo
        for (int i = 0; i < numFilas; i++) {
            System.out.print("Ingrese la fila #" + (i + 1) + " separada por comas: ");
            String fila = scanner.nextLine();
            String[] elementos = fila.split(",");

            // Asignar elementos a las columnas correspondientes
            for (int j = 0; j < Math.min(numColumnas, elementos.length); j++) {
                arregloBidimensional[i][j] = elementos[j];
            }
        }

        // Imprimir el arreglo construido (Filas como columnas, Columnas como filas)
        System.out.println("\nArreglo Bidimensional (Filas como columnas, Columnas como filas):");
        for (int i = 0; i < numColumnas; i++) {
            for (int j = 0; j < numFilas; j++) {
                System.out.print(arregloBidimensional[j][i] + "\t");
            }
            System.out.println();
        }

        // Imprimir el arreglo construido de forma normal
        System.out.println("\nArreglo Bidimensional (Forma normal):");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.print(arregloBidimensional[i][j] + "\t");
            }
            System.out.println();
        }

        // Cerrar el scanner
        scanner.close();
    }
}




