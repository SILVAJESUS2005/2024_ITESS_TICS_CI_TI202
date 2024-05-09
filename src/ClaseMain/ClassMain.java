package ClaseMain;

import CuentaBancaria_JLS.CuentaBancaria;
import javax.swing.JOptionPane;

public class ClassMain {

    public static void main(String[] args) {
        ClassMain mc = new ClassMain();

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1. CUENTA 1 \n"
                + "2. CUENTA 2 \n"
                + "Salir"));

        if (opcion == 1) {
            JOptionPane.showMessageDialog(null, "ELIGIO CUENNTA 1");
            int Nip = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU NIP"));

            if (Nip == 2347) {
                CuentaBancaria c1 = new CuentaBancaria("Juan Perez", "123456789", 1000.0, "Ahorros", "HSBC");
                        JOptionPane.showMessageDialog(null,c1.toString());
       
   
            } else {
                JOptionPane.showMessageDialog(null, "NIP Incorrecto");
            }

        }
        if (opcion == 2) {
            JOptionPane.showMessageDialog(null, "ELIGIO CUENNTA 2");
            int Nip = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU NIP"));

            if (Nip == 1312) {
                CuentaBancaria c2 = new CuentaBancaria("Juan Perez", "123456789", 1000.0, "Ahorros", "HSBC");
                c2.setTitular("Melany Sanchez Garcia");
                c2.setNumeroCuenta("12345678910");
                c2.setSaldo(3000);
                c2.setTipo("Ahorros");
                c2.setBanco("BANAMEX");
                                        JOptionPane.showMessageDialog(null,c2.toString());

            } else {
                JOptionPane.showMessageDialog(null, "NIP Incorrecto");
            }

        }
    }

}
