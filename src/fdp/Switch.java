/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fdp;
import java.util.Scanner;
/**
 * PRACTICA 3: DIAS LABORALES O NO
 * @author JeSÚS LÓPEZ SILVA
 * DESCRIPCIÓN: ESTE PROGRAMA TE DA UNA RESPUESTA DE SI TU DIA QUE PROPORCIONASTE ES LABORAL O NO, Y TODO ESTO AL PROPORCIONARLE UN DATO DE ENTRADA
 * DEL DIA EN QUE TE ENCUENTRAS.
 */
public class Switch {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un día de la semana: ");
        String dia = scanner.nextLine();

        switch (dia.toLowerCase()) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día laboral.");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println("Es un día no laboral. ¡DISFRUTA TU FIN DE SEMANA!");
                break;
            default:
                System.out.println("¡Diviértete!");
                break;
        }
    }
}



