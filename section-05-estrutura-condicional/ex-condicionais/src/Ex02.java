import java.util.Scanner;

public class Ex02 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercício 02");

        int numero;
        System.out.print("Insira um número inteiro: ");
        numero = sc.nextInt();
        System.out.printf("Número digitado: %d%n", numero);

        if (numero % 2 == 0){
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
        sc.close();
    }
}
