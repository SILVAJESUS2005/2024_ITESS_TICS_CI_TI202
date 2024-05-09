/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* ÁLGEBRA LINEAL
* TI202 JLS
* 16 DE FEBRERO DEL 2024
* PROGRAMA QUE REDUCE LAS POTENCIAS DE i A PARTIR DEL NUMERADOR Y EL DENOMINADOR.
* jesuslopezsilva206@gmail.com
 */
package PotenciasDe_i_AL_JLS;

import java.util.Scanner;

public class PotenciasDeLa_i_AL_JLS {

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

    @Override
    public String toString() {
        int FinalPower = this.NumeratorPower - this.DenominatorPower;
        FinalPower %= 4;

        if (FinalPower == 0 || FinalPower == -2) {
            return "1";
        }
        if (FinalPower == 1 || FinalPower == -3) {
            return "i";
        }
        if (FinalPower == 2) {
            return "-1";
        }
        return "-i";

    }
}
