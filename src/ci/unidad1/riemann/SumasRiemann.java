/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* CALCULO INTEGRAL
* TI202 JLS
* 23 DE FEBRERO DEL 2024
* UNIDAD 1: TEOREMA FUNDAMENTAL DEL CALCULO
* SERIES RIEMANN
* jesuslopezsilva206@gmail.com
 */
package ci.unidad1.riemann;

public class SumasRiemann {

    protected double[] x;
    protected double[] w;
    protected double[] dx;
    protected double[] fw;
    protected double suma;

    public SumasRiemann(double[] x, double[] w) {
        this.x = x;
        this.w = w;

        dx = new double[w.length];
        fw = new double[w.length];
    }

    public void calcular() {
        //calcular dx
        for (int i = 0; i < dx.length; i++) {
            dx[i] = x[i + 1] - x[i];
        }
        //calcular fw y suma
        suma = 0;
        for (int i = 0; i < dx.length; i++) {
            fw[i] = funcion(w[i]);
            suma += fw[i] * dx[i];
        }
    }

    public double funcion(double x) {
        return 1.0;
    }

    public void print() {
        System.out.println("i   |   wi  |   dxi |   fi  ");
        for (int i = 0; i < w.length; i++) 
            System.out.println(i + "  |   " + w[i] + "     |   "
                    + dx[i] + "  |   " + fw[i]);
            System.out.println("Suma: " + suma);

        
    }

}
