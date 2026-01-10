package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void  main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex2 - Raio e área do círculo");

        double pi = 3.14159;
        double area;
        double raioCirculo;
        System.out.print("Entre com o valor do raio do círculo: ");
        raioCirculo = sc.nextDouble();

        area = pi * (Math.pow(raioCirculo, 2.0));

        System.out.printf("O valor da área é: %.4f%n", area);

        sc.close();
    }
}
