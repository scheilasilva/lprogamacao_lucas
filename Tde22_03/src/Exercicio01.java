import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        int numero, soma= 0, i = 1;

        System.out.println("digite um numero interior positivo");
        numero = pc.nextInt();

        while(i<=numero){
            soma +=i;
            i++;
        }
        System.out.println("a soma dos numeros naturais ate" + numero + "é:" + soma);

    }
}
