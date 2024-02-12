/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* CALCULO INTEGRAL
* TI202 JLS
* 12 DE FEBRERO DEL 2024
* APROxIMACION DE FUNCIONES USANDO SUMAS, PRUEBA.
* jesuslopezsilva206@gmail.com
 */
package ci.unidad1.aproximation;

public class FunctionAproximationTest {

    public static void main(String[] args) {
        FunctionAproximation fa = new FunctionAproximation(0.0, 4.0, 4);
        fa.compute();
        System.out.println("AREA: " + fa.getArea());
    }

}
