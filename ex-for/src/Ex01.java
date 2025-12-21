import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;
        System.out.print("Insira um valor inteiro: ");
        valor = sc.nextInt();

        for (int i = 1; i <= valor; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
