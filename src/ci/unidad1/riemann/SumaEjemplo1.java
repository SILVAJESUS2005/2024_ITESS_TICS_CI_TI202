/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* CALCULO INTEGRAL
* TI202 JLS
* 23 DE FEBRERO DEL 2024
* UNIDAD 1: TEOREMA FUNDAMENTAL DEL CALCULO
* SERIES RIEMANN EJEMPLO 1
* jesuslopezsilva206@gmail.com
 */
package ci.unidad1.riemann;

public class SumaEjemplo1 extends SumasRiemann {

    public SumaEjemplo1(double[] x, double[] w) {
        super(x, w);
    }
    
    @Override
    public double funcion(double x) {
        return 10-x*x;
    }
}
