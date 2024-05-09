/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.poo;

/**
 *
 * @author Jesus
 */
public class tres {

    public static void main(String[] args) {
        double a = (1.0 / 6) * Math.PI;
        double b = (5.0 / 6) * Math.PI;
        int n = 8;

        double deltaX = (b - a) / n;
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            double xi = a + i * deltaX;
            double fxi = Math.sin(xi);
            sum += fxi * deltaX;
        }

        System.out.println("Área aproximada: " + sum);
    }
}

