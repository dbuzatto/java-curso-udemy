import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");
        int valor = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < valor; i++){
            int x = sc.nextInt();
            if (x >= 10 && x <=20){
                in++;
            }else{
                out++;
            }
        }

        System.out.printf("Número de 'in': %d%nNúmero de 'out': %d%n", in, out);



        sc.close();
    }
}
