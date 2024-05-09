package Practicas_ModeladoUML_JLS;

import CuentaBancaria_JLS.CuentaBancaria;
import javax.swing.JOptionPane;

public class GestorCuenta {

    public static void operarCuenta(CuentaBancaria cuenta, CuentaBancaria otraCuenta) {
        int nipIngresado;
        do {
            nipIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el NIP de la cuenta:"));
        } while (nipIngresado != cuenta.getNip());

        boolean salir = false;
        while (!salir) {
            int opcionOperacion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"
                    + "1. Realizar depósito\n"
                    + "2. Realizar retiro\n"
                    + "3. Consultar saldo\n"
                    + "4. Transferir fondos\n"
                    + "5. Pagar\n"
                    + "6. Regresar al menú de cuentas"));

            switch (opcionOperacion) {
                case 1:
                    double montoDeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
                    cuenta.depositar(montoDeposito);
                    JOptionPane.showMessageDialog(null, "Depósito realizado. Nuevo saldo: " + cuenta.getSaldo());
                    break;
                case 2:
                    double montoRetiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
                    cuenta.retirar(montoRetiro);
                    JOptionPane.showMessageDialog(null, "Retiro realizado. Nuevo saldo: " + cuenta.getSaldo());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta es: $" + cuenta.getSaldo());
                    break;
                case 4:
                    transferir(cuenta, otraCuenta);
                    break;
                case 5:
                    pagar(cuenta);
                    break;
                case 6:
                    salir = true; // Salir del bucle y regresar al menú de selección de cuentas
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }

    public static void transferir(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino) {
        // Verificar el NIP de la cuenta de origen
        int nipIngresado;
        do {
            nipIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el NIP de la cuenta de origen:"));
        } while (nipIngresado != cuentaOrigen.getNip());

        // Solicitar monto para la transferencia
        double montoTransferir = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a transferir:"));

        // Verificar si es posible transferir
        if (montoTransferir <= cuentaOrigen.getSaldo()) {
            // Reducir el saldo de la cuenta de origen
            cuentaOrigen.retirar(montoTransferir);

            // Aumentar el saldo de la cuenta destino
            cuentaDestino.depositar(montoTransferir);

            // Mostrar información sobre la transferencia
            JOptionPane.showMessageDialog(null, "Transferencia realizada con éxito:\n"
                    + "Monto transferido: $" + montoTransferir + "\n"
                    + "Saldo actual de " + cuentaDestino.getTitular() + ": $" + cuentaDestino.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar la transferencia.");
        }
    }

    public static void pagar(CuentaBancaria cuenta) {
        // Verificar el NIP de la cuenta
        int nipIngresado;
        do {
            nipIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el NIP de la cuenta:"));
        } while (nipIngresado != cuenta.getNip());

        // Solicitar cantidad y concepto de pago
        double montoPagar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a pagar:"));

        // Realizar el pago (restar monto del saldo)
        if (montoPagar <= cuenta.getSaldo()) {
            String conceptoPago = JOptionPane.showInputDialog("Ingrese el concepto de pago:");

            cuenta.retirar(montoPagar);
            JOptionPane.showMessageDialog(null, "Pago realizado con éxito:\n"
                    + "Monto pagado: $" + montoPagar + "\n"
                    + "Concepto: " + conceptoPago + "\n"
                    + "Nuevo saldo: $" + cuenta.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar la transferencia.");

        }

    }
}
