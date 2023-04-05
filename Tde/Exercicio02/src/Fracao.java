public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Fracao multiplicar(Fracao outra ) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new  Fracao(novoNumerador, novoDenominador);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }
}