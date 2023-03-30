public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(4, 5);
        System.out.println("Área do triângulo: " + t.calcularArea());

        Quadrado q = new Quadrado(3);
        System.out.println("Área do quadrado: " + q.calcularArea());

        Circunferencia c = new Circunferencia(2);
        System.out.println("Área da circunferência: " + c.calcularArea());

        Trapezio tr = new Trapezio(6, 4, 2);
        System.out.println("Área do trapézio: " + tr.calcularArea());
    }

}