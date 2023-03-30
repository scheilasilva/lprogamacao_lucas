import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numero;
        int numDivisores = 0;
        boolean primo = true;
        System.out.println("digite um numero inteiro e positivo");
        numero = tc.nextInt();

        for (int i = 2; i <= numero; i++) {
           if(numero % i == 0){
               numDivisores++;
           }
        }
        if (numDivisores==2){
            System.out.println("o numero, " + numero + "é um numero primo");

        }else{
            System.out.println("o numero, " + numero + " nao é um numero primo");
        }
    }
}
