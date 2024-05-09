/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentaBancaria_JLS;

/**
 *
 * @author Jesus
 */
public class MainClass {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Perez", "123456789", 1000.0, "Ahorros", "HSBC");

        System.out.println(cuenta1.toString());
        cuenta1.consultarSaldo();

        cuenta1.depositar(500.0);

        cuenta1.retirar(200.0);
        
        cuenta1.consultarSaldo();
    }
}
