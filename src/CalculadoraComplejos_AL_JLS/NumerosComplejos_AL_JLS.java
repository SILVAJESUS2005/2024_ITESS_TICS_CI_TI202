package CalculadoraComplejos_AL_JLS;

public class NumerosComplejos_AL_JLS {

    private double real;

    private double imaginario;

    public NumerosComplejos_AL_JLS(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;

    }

    @Override
    public String toString() {

        double real = this.getReal();
        double imaginario = this.getImaginario();

        if (real == 0 && imaginario == 0) {
            return "0";

        }
        String complejo = (real != 0 ? "" + real : "");
        if (imaginario == 0) {
            return complejo;

        } else if (imaginario > 0) {
            complejo += (real != 0 ? " + " : "");

        } else if (imaginario < 0) {
            complejo += " - ";
        }
        complejo += (Math.abs(imaginario) != 1 ? "" : Math.abs(imaginario));
        return complejo + "i";
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginario() {
        return this.imaginario;
    }
}
