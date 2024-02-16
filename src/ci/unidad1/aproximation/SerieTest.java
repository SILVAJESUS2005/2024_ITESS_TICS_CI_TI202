/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* CALCULO INTEGRAL
* TI202 JLS
* 16 DE FEBRERO DEL 2024
* UNIDAD 1: TEOREMA FUNDAMENTAL DEL CALCULO
* CALCULO DE SERIES TEST.
* jesuslopezsilva206@gmail.com
 */
package ci.unidad1.aproximation;

public class SerieTest {

    public static void main(String[] args) {
        Serie s = new Serie(1, 25);

        s.compute();
        s.print();
    }
}
