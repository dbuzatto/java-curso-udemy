package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ex4 - Calcula salário");

        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        System.out.print("Insira seu número de funcionário: ");
        numeroFuncionario = sc.nextInt();

        System.out.print("Número de HORAS trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.print("Por fim, insira quando ganha por hora: ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d%n SALARY = U$ %.2f%n", numeroFuncionario, salario);




        sc.close();
    }
}
