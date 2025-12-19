package estrutura_sequencial;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex3 - Diferença");

        int a, b, c, d;
        int diferenca;
        System.out.println("Digite 4 valores, separados por enter: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = (a * b) - (c * d);
        System.out.printf("DIFERENÇA: %d%n", diferenca);

        sc.close();
    }
}
