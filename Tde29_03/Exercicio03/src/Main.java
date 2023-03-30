public class Main {
    public static void main(String[] args) {
        Quadrado q  = new Quadrado();
        q.lado = 4;
        double resultadoq = q.calcularArea();
        System.out.println("quadrado:"+resultadoq);


        Triangulo t = new Triangulo();
        t.base = 4;
        t.altura = 5;
        double resultadot = t.calcularArea();
        System.out.println("Triangulo:"+resultadot);

        Circunferencia c = new Circunferencia();
        c.raio = 2;
        double resultadoc = c.calcularArea();
        System.out.println("circunferenca"+resultadoc);

        Trapezio p = new Trapezio();
        p.baseMenor = 4;
        p.baseMaior = 6;
        p.altura = 2;
        double resultadop = p.calcularArea();
        System.out.println("trapezio"+resultadop);
    }


}