import java.util.Scanner;

public class EX03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercício 03");

        int numero1, numero2;
        System.out.println("Insira dois valores, separados por enter.");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        System.out.printf("Valores digitados: %d %d%n", numero1, numero2);

        if ( numero1 % numero2 == 0 || numero2 % numero1 == 0){
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
