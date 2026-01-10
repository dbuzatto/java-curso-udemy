package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Insira o nome do aluno: ");
        student.nome = sc.nextLine();

        System.out.println("Digite as 3 notas do aluno: ");
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.calcularNotaFinal());

        if (student.calcularNotaFinal() >= 60.0) {
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.calcularPontosFaltantes());
        }

        sc.close();
    }
}
