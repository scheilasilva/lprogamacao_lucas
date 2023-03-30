import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numero, i =1;

        System.out.println("um numero inteiro e positivo");
        numero = tc.nextInt();

        System.out.println("numeros pares entre 1 e " + numero + ":");

        while(i<=numero){
            if(i%2 ==0){
                System.out.print(i+",");

            }
            i++;
        }

    }
}
