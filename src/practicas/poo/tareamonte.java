/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.poo;

/**
 *
 * @author Jesus
 */
public class tareamonte {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 3.0;
        int n = 10;

        double deltaX = (b - a) / n;
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            double xi = a + i * deltaX;
            double fxi = 1.0 / xi;
            sum += fxi * deltaX;
        }

        System.out.println("Área aproximada: " + sum);
    }
}


