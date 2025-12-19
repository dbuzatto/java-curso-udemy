package estrutura_sequencial;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex1 - Soma de dois valores inteiros.");

        int valor1, valor2;
        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextInt();

        int soma = valor1 + valor2;

        System.out.printf("Conta: %d + %d, SOMA: %d%n", valor1, valor2, soma);

        sc.close();
    }
}
