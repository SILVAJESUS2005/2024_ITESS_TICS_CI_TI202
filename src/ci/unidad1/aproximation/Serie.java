/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* CALCULO INTEGRAL
* TI202 JLS
* 16 DE FEBRERO DEL 2024
* UNIDAD 1: TEOREMA FUNDAMENTAL DEL CALCULO
* CALCULO DE SERIES.
* jesuslopezsilva206@gmail.com
 */
package ci.unidad1.aproximation;

public class Serie {

    private int iIni;
    private int iEnd;
    private int n;
    private int i[];
    private int f[];
    private int suma;

    public Serie(int iIni, int iEnd) {
        this.iIni = iIni;
        this.iEnd = iEnd;

        this.n = iEnd - iIni + 1;
        i = new int[n];
        f = new int[n];

    }

    public void compute() {
        suma = 0;
        int index = 0;
        for (int i = iIni; i <= iEnd; i++) {
            this.i[index] = i;
            this.f[index] = 2 * (i * i) - 2 * i;
            suma += f[index];
            index++;

        }
    }

    public void print() {
        System.out.println("INDEX  |   i   |   f");
        for (int index = 0; index < n; index++) {
            System.out.println(index + "     |   " + i[index] + "     |   " + f[index]);
            
        }
        System.out.println("SUMA: " + suma);

    }

}
