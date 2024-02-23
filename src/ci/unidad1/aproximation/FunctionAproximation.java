/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* CALCULO INTEGRAL
* TI202 JLS
* 12 DE FEBRERO DEL 2024
* UNIDAD 1: TEOREMA FUNDAMENTAL DEL CALCULO
* APROxIMACION DE FUNCIONES USANDO SUMAS
* jesuslopezsilva206@gmail.com
 */
package ci.unidad1.aproximation;

public class FunctionAproximation {

    private double xIn;
    private double xEnd;
    private int n;
    private double dx;
    private double x[];
    private double fx[];
    private double area;

    public FunctionAproximation(double xIn, double xEnd, int n) {
        this.xIn = xIn;
        this.xEnd = xEnd;
        this.n = n;

        this.x = new double[n + 1];
        this.fx = new double[n + 1];
    }

    public void compute() {
        dx = (xEnd - xIn) / n;
        for (int i = 0; i <= n; i++) {
            x[i] = xIn + i * dx;
            /*fx[i] = x[i] * x[i];*/
            fx[i] = 1/x[i];
            area = area + fx[i] * dx;
        }
    }

    public double getArea() {
        return area;
        
        
    }

}
