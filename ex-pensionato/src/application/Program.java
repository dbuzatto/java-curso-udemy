package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] quartos = new Student[10];
        System.out.print("Informe a quantidade de estudantes que irão alugar quartos (1 a 10): ");
        int numeroEstudantes = sc.nextInt();

        for (int i = 0; i < numeroEstudantes; i++) {
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            quartos[quarto] = new Student(nome, email);
        }

        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}
