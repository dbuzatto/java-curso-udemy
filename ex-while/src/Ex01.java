import java.util.Scanner;

public class Ex01 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercício 01");

        int senhaCorreta = 2002;
        int senhaDigitada;

        System.out.print("Por favor, digite a senha: ");
        senhaDigitada = sc.nextInt();

        while (senhaDigitada != senhaCorreta){
            System.out.print("Senha incorreta, por favor tente novamente: ");
            senhaDigitada = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
