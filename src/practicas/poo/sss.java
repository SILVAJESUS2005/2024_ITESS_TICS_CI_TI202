/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.poo;

/**
 *
 * @author Jesus
 */
public class sss {


    // Define la función a integrar: x^2
    public static double funcion(double x) {
        return Math.cos(x);
    }

    // Aproximación de la integral por la izquierda
    public static double integralIzquierda(double a, double b, int n) {
        double delta_x = (b - a) / n;
        double suma = 0;
        for (int i = 0; i < n; i++) {
            double xi = a + i * delta_x;
            suma += funcion(xi);
        }
        return suma * delta_x;
    }

    // Aproximación de la integral por la derecha
    public static double integralDerecha(double a, double b, int n) {
        double delta_x = (b - a) / n;
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            double xi = a + i * delta_x;
            suma += funcion(xi);
        }
        return suma * delta_x;
    }

    public static void main(String[] args) {
        // Define los límites de integración
        double a = 0;
        double b = Math.PI;

        // Números de subdivisiones
        int[] nValues = {1, 10, 100, 1000, 1000000};

        // Calcula e imprime los resultados
        for (int n : nValues) {
            double resultadoIzquierda = integralIzquierda(a, b, n);
            double resultadoDerecha = integralDerecha(a, b, n);
            System.out.println("Aproximación por la izquierda (n=" + n + "): " + resultadoIzquierda);
            System.out.println("Aproximación por la derecha (n=" + n + "): " + resultadoDerecha);
            System.out.println("----------------------------------");
        }
    }
}


