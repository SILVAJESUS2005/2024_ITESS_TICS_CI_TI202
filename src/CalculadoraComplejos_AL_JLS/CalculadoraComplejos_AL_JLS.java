package CalculadoraComplejos_AL_JLS;

public class CalculadoraComplejos_AL_JLS {

    public NumerosComplejos_AL_JLS sumarComplejos(NumerosComplejos_AL_JLS Z1, NumerosComplejos_AL_JLS Z2) {
        double real;
        double imaginario;

        real = Z1.getReal() + Z2.getReal();
        imaginario = Z1.getImaginario() + Z2.getImaginario();

        return new NumerosComplejos_AL_JLS(real, imaginario);
    }

    public NumerosComplejos_AL_JLS restarComplejos(NumerosComplejos_AL_JLS Z1, NumerosComplejos_AL_JLS Z2) {
        NumerosComplejos_AL_JLS menosZ2 = new NumerosComplejos_AL_JLS(Z2.getReal() * -1, Z2.getImaginario() * -1);
        return sumarComplejos(Z1, menosZ2);
    }

    public NumerosComplejos_AL_JLS multiplicarComplejos(NumerosComplejos_AL_JLS Z1, NumerosComplejos_AL_JLS Z2) {
        double real = Z1.getReal() * Z2.getReal() + Z1.getImaginario() * Z2.getImaginario();
        double imaginario = Z1.getReal() * Z2.getImaginario() + Z1.getImaginario() * Z2.getReal();

        return new NumerosComplejos_AL_JLS(real, imaginario);
    }

    public NumerosComplejos_AL_JLS calcularconjugado(NumerosComplejos_AL_JLS Z) {
        return new NumerosComplejos_AL_JLS(Z.getReal(), Z.getImaginario() * -1);
    }

    public NumerosComplejos_AL_JLS dividircomplejos(NumerosComplejos_AL_JLS Z1, NumerosComplejos_AL_JLS Z2) {
        NumerosComplejos_AL_JLS numerador = multiplicarComplejos(Z1, calcularconjugado(Z2));
        double denominador = Math.pow(Z2.getReal(), 2) + Math.pow(Z2.getImaginario(), 2);
        return new NumerosComplejos_AL_JLS(numerador.getReal() / denominador, numerador.getImaginario() / denominador);

    }

}
