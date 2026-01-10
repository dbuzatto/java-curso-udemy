import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercício 03");

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("1.Álcool \n2.Gasolina \n3.Diesel \n4.Fim");
        System.out.print("Digite o que deseja: ");
        int escolha = sc.nextInt();

        while (escolha != 4){
            if (escolha == 1){
                alcool ++;
            } else if (escolha == 2){
                gasolina ++;
            }else if (escolha == 3){
                diesel ++;
            }
            System.out.println("1.Álcool \n2.Gasolina \n3.Diesel \n4.Fim");
            System.out.print("Digite o que deseja: ");
            escolha = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
