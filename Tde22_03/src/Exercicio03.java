import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numero;

        System.out.println("digite um numero inteiro positivo");
        numero = tc.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(numero + "x" + i + "-" + (numero * i));

        }

    }
}
