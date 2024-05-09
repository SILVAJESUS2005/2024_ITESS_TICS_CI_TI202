/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.poo;

/**
 *
 * @author Jesus
 */
public class dos {

    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        int n = 12;

        double deltaX = (b - a) / n;
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            double xi = a + i * deltaX;
            double fxi = 1.0 / (xi * xi);
            sum += fxi * deltaX;
        }

        System.out.println("Área aproximada: " + sum);
    }
}


