/*
                Tahereh Farhang , Barbod Accademy , 5th session , 15th excercise.
                            Transpose matrix
 */
package Transpose;

import java.util.Scanner;

public class Transpose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of rows : ");
        int r1 = sc.nextInt();
        System.out.print("Please enter number of column : ");
        int c1 = sc.nextInt();
        int[][] arr01 = new int[r1][c1];
        for (int i = 0; i < arr01.length; i++) {
            for (int j = 0; j < arr01[i].length; j++) {
                System.out.print(String.format("Arr01 [%d][%d] : ", i, j));
                arr01[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your matrix is : ");
        for (int i = 0; i < arr01.length; i++) {
            System.out.println();
            for (int j = 0; j < arr01[i].length; j++) {
                System.out.print(String.format("%d \t ", arr01[i][j]));
            }
        }
        System.out.println();
        System.out.println("And your Transpose is : ");
        int[][] arrTar = new int[c1][r1];
        for (int i = 0; i < arrTar.length; i++) {
            System.out.println();
            for (int j = 0; j < arrTar[i].length; j++) {
                arrTar[i][j] = arr01[j][i];
                System.out.print(String.format("%d \t", arrTar[i][j]));
            }
        }
    }
}
