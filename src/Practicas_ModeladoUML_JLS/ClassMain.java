package Practicas_ModeladoUML_JLS;

import CuentaBancaria_JLS.CuentaBancaria;
import javax.swing.JOptionPane;

public class ClassMain {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Perez", "123456789", 1000.0, "Ahorros", "HSBC");
        CuentaBancaria cuenta2 = new CuentaBancaria("Melany Sanchez Garcia", "12345678910", 3000.0, "Ahorros",
                "BANAMEX");

        boolean salirPrograma = false;
        while (!salirPrograma) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"
                    + "1.  Cuenta 1\n"
                    + "2.  Cuenta 2\n"
                    + "3. Salir"));

            switch (opcion) {
                case 1:
                    GestorCuenta.operarCuenta(cuenta1, cuenta2); 
                    break;
                case 2:
                    GestorCuenta.operarCuenta(cuenta2, cuenta1);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    salirPrograma = true; // Salir del bucle principal y terminar el programa
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}
