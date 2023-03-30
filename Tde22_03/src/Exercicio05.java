import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        int numero;

        System.out.println("digite um numero inteiro positivo");
        numero= tc.nextInt();

        for (int i = 1; i <=numero ; i++) {
            if (i%2!=0){
                System.out.println(i + "");
            }

        }
    }
}
