/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* MATEMATICAS DISCRETAS II
* TI202 JLS
* 11 DE MARZO DEL 2024
* PROGRAMA QUE IMPRIME EL DIAGRAMA DE ARBOL APARTIR DE LA ENTRADA DE DOS RECORRIDOS,
*  EL IN ORDER ES OBLIGATORIO, PRE ORDER Y POS ORDER SON OPCION PARA EL SEGUNDO RECORRIDO.
* jesuslopezsilva206@gmail.com
 */
package MDII_DiagramaArbol_JLS_FChC;

import java.util.Scanner;

public class MDII_DiagramaArbol_JLS_FChC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String IN_ORDER;
        int OPCION;
        String POS_ORDER;
        String PRE_ORDER;
        System.out.println("DIAGRAMA DE ARBOL APARTIR DE RECORRIDOS");
        System.out.println("   Ingrese \n"
                + "1. PRE ORDER \n"
                + "2. POS ORDER \n");
        OPCION = sc.nextInt();
        System.out.println("RECUERDA INGRESAR LOS RECORRIDOS SEPARADOS POR COMA (,)");
        if (OPCION == 1) {

            System.out.println("Ingresar el recorrido IN ORDER: ");
            IN_ORDER = sc.next();
            System.out.println("Ingresar el recorrido PRE ORDER: ");
            PRE_ORDER = sc.next();
            String[] In_Order = IN_ORDER.split(",");
            String[] Pre_Order = PRE_ORDER.split(",");
            String[][] Recorridos = new String[Pre_Order.length][In_Order.length];
            if (Pre_Order.length == In_Order.length) {
                //Se imprime el IN ORDER
                for (int i = 0; i < In_Order.length; i++) {
                    System.out.print("\t" + In_Order[i]);
                }
                System.out.println("\n");
                //Se imprime PRE ORDEN
                for (int i = 0; i < Pre_Order.length; i++) {
                    System.out.print(Pre_Order[i]);

                    for (int j = 0; j < Pre_Order.length; j++) {
                        if (Pre_Order[i].equals(In_Order[j])) {
                            Recorridos[i][j] = "\t" + Pre_Order[i];
                            System.out.print(Recorridos[i][j]);
                        } else if (Pre_Order[0].equals(In_Order[j])) {
                            Recorridos[i][j] = "\t" + "^";
                            System.out.print(Recorridos[i][j]);
                        } else {
                            Recorridos[i][j] = "\t" + ".";
                            System.out.print(Recorridos[i][j]);
                        }

                    }
                    System.out.print("\n");
                }

            } else {
                System.out.println("LOS RECORRIDOS SON DE DIFERENTE TAMANO!");
            }
        } else if (OPCION == 2) {

            System.out.println("Ingresar el recorrido IN ORDER: ");
            IN_ORDER = sc.next();
            System.out.println("Ingresar el recorrido POS ORDER: ");
            POS_ORDER = sc.next();
            String[] In_Order = IN_ORDER.split(",");
            String[] Pos_Order = POS_ORDER.split(",");
            String[][] Recorridos = new String[Pos_Order.length][In_Order.length];
            if (Pos_Order.length == In_Order.length) {
                //Se imprime el IN ORDER
                for (int i = 0; i < In_Order.length; i++) {
                    System.out.print("\t" + In_Order[i]);
                }
                System.out.println("\n");
                //Se imprime POS ORDEN
                for (int i = Pos_Order.length - 1; i >= 0; i--) {
                    System.out.print(Pos_Order[i]);

                    for (int j = 0; j < Pos_Order.length; j++) {
                        if (Pos_Order[i].equals(In_Order[j])) {
                            Recorridos[i][j] = "\t" + Pos_Order[i];
                            System.out.print(Recorridos[i][j]);
                        } else if (Pos_Order[Pos_Order.length-1].equals(In_Order[j])) {
                            Recorridos[i][j] = "\t"+"|";
                            System.out.print(Recorridos[i][j]);
                        } else {
                            Recorridos[i][j] = "\t"+".";
                            System.out.print(Recorridos[i][j]);
                        }

                    }
                    System.out.print("\n");
                }
            } else {
                System.out.println("LOS RECORRIDOS SON DE DIFERENTE TAMANO!");

            }
        }else{
            System.out.println("INGRESE UNA OPCION VALIDA");
        }

    }
}
