package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Linhas: ");
        int M = sc.nextInt();
        System.out.print("Colunas: ");
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        // preenchendo matriz
        System.out.println("Entre com os valores: ");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.print("Escolha um valor X presente na matriz: ");
        int X = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == X) {
                    System.out.println("Posição " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Direita: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Abaixo: " + mat[i + 1][j]);
                    }
                }
            }
        }


        sc.close();
    }
}
