import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercício 05");

        int codigo, quantidade;
        double precoFinal;
        System.out.print("Entre com o código do produto: ");
        codigo = sc.nextInt();

        System.out.print("Entre com a quantidade do produto: ");
        quantidade = sc.nextInt();

        if (codigo == 1){
            precoFinal = quantidade * 4.00;
            System.out.printf("Valor a pagar: R$%.2f%n", precoFinal);
        } else if (codigo == 2){
            precoFinal = quantidade * 4.50;
            System.out.printf("Valor a pagar: R$%.2f%n", precoFinal);
        } else if (codigo == 3){
            precoFinal = quantidade * 5.00;
            System.out.printf("Valor a pagar: R$%.2f%n", precoFinal);
        } else if (codigo == 4){
            precoFinal = quantidade * 2.00;
            System.out.printf("Valor a pagar: R$%.2f%n", precoFinal);
        } else if (codigo == 5){
            precoFinal = quantidade * 1.50;
            System.out.printf("Valor a pagar: R$%.2f%n", precoFinal);
        } else {
            System.out.println("Digite um código válido (1-5)");
        }


        sc.close();
    }
}
