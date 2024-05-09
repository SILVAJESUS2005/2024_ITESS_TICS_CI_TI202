/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* CALCULO LINEAL
* TI202 JLS
* 16 DE FEBRERO DEL 2024
* PROGRAMA QUE REDUCE LAS POTENCIAS DE i.
* jesuslopezsilva206@gmail.com
 */
package practicas.poo;


import java.util.Scanner;


public class Potencias {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("PROPORCIONE EL VALOR DE LOS EXPONENTES DE I...");
        System.out.println("EXPONENTE DEL NUMERADOR: ");
        int NumeratorPower = reader.nextInt();
        System.out.println("EXPONENTE DEL DENOMIANDOR: ");
        int DenominatorPower = reader.nextInt();

        ImaginaryUnit Expression = new ImaginaryUnit(NumeratorPower, DenominatorPower);

        System.out.println("EL VALOR DE LA EXPRESION REDUCIDA DE I ES:   " + Expression);
    }
}

class ImaginaryUnit {

    private int NumeratorPower;
    private int DenominatorPower;

    public ImaginaryUnit(int NumeratorPower, int DenominatorPower) {
        this.NumeratorPower = NumeratorPower;
        this.DenominatorPower = DenominatorPower;
    }

}

