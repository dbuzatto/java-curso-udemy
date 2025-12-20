import java.util.Scanner;

public class Ex01 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercício 01");

        int numero;
        System.out.print("Insira um número inteiro: ");
        numero = sc.nextInt();
        System.out.printf("Número digitado: %d%n", numero);

        if ( numero >=0 ){
            System.out.println("NÃO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
