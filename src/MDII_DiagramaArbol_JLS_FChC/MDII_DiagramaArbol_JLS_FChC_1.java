package MDII_DiagramaArbol_JLS_FChC;

import java.util.Scanner;

public class MDII_DiagramaArbol_JLS_FChC_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE EL RECORRIDO IN ORDER SEPARADO POR COMAS: ");
        String InOrder1 = leer.nextLine();
        String[] InOrder = InOrder1.split(",");

        System.out.println("DE QUE TIPO SERA EL SIGUIENTE RECORRIDO: "
                + "1. PRE ORDER "
                + "2. POS ORDER");
        int Opcion = leer.nextInt();
        leer.nextLine(); 

        if (Opcion == 1) {
            System.out.println("INGRESE EL RECORRIDO SEPARADO POR COMAS: ");
            String PreOrder1 = leer.nextLine();
            String[] PreOrder = PreOrder1.split(", ");

        } else if (Opcion == 2) {
            System.out.println("INGRESE EL RECORRIDO SEPARADO POR COMAS: ");
            String PosOrder1 = leer.nextLine();
            String[] PosOrder = PosOrder1.split(", ");

        }

      
    }
}
