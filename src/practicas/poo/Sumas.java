
package practicas.poo;


public class Sumas {


    // Define la función a integrar
    public static double funcion(double x) {
        // Ejemplo: x^2
        return x * x ;
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
        double a = -1;
        double b = 2;

        // Números de subdivisiones
        int[] nValues = {1, 10, 100, 1000, 1000000};

        // Calcula e imprime los resultados
        for (int n : nValues) {
            double resultadoIzquierda = integralIzquierda(a, b, n);
            double resultadoDerecha = integralDerecha(a, b, n);
            System.out.println("Aproximacion por la izquierda (n=" + n + "): " + resultadoIzquierda);
            System.out.println("Aproximacion por la derecha (n=" + n + "): " + resultadoDerecha);
            System.out.println("----------------------------------");
        }
    }
}


