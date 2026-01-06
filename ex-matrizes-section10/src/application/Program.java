package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        // preencher matriz, linha e coluna
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        // imprimir a diagonal principal "\"
        System.out.println("Main diagonal: ");

        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        // conta valores negativos
        int countNegative = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j< n; j++){
                if (mat[i][j] < 0) {
                    countNegative++;
                }
            }
        }

        System.out.print("Negative numbers: " + countNegative);
        sc.close();
    }
}
