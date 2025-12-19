import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Objeto para receber os dados do teclado
        Scanner sc = new Scanner(System.in);

        //String
        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        //int
        int y;
        y = sc.nextInt();
        System.out.println("Você digitou o valor inteiro: " + y);

        //double
        //ele pega a localidade do computador, por isso tem que ser digitado com , se quisesse que fosse com . teria que usar Locale.setDefault(Locale.US);
        double z;
        z = sc.nextDouble();
        System.out.println("Você digitou o valor com ponto flutuante: " + z);

        //char
        char b;
        b = sc.next().charAt(0);
        System.out.println("Você digitou o caracter: " + b);


        /*Vários dados e impressao. Mesma linha, separado por espaços
        Exemplo de saída
        diogo 22 1,75
        Dados digitados:
        diogo
        22
        1.75
         */
        String c;
        int d;
        double e;

        c = sc.next();
        d = sc.nextInt();
        e = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //sc.nextLine(); para entrada de dados com quebra de linha
        sc.close();
    }
}
