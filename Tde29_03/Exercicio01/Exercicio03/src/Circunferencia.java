public class Circunferencia {
    private double raio;
    private final double PI = 3.14159265359;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return PI * raio * raio;
    }
}