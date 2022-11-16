
package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class mal {
    public static void main(String[] args) {

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] mal = new int[3][3];
        Scanner s = new Scanner(System.in);
        // matrix a
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        System.out.println("Enter matrix a :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Print matrix a :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        // matrix b
        /*
         * 9 8 7
         * 6 5 4
         * 3 2 1
         */
        System.out.println("Enter matrix b :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = s.nextInt();
            }
        }
        System.out.println("Print matrix b :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multiplication matrix a and b :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mal[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    mal[i][j] += a[i][k] * b[k][j];
                    System.out.println(mal[i][j] + " ");
                }
            }
        }
        System.out.println("Multiplication matrix is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mal[i][j] + " ");
            }
            System.out.println();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("matrix1.txt"));
            System.out.println(reader.readLine());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        

    }
}
