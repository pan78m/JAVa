package File_Handling;

import java.io.File;
import java.util.Scanner;
import java.io.*;

public class maltiplication {

    public static void main(String[] args) throws IOException {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Elements of the 1st Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the Elements of the 2nd Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = input.nextInt();
            }
        }

        int[][] multi = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multi[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    multi[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        File file1 = new File("matrix1.txt");
        File file2 = new File("matrix2.txt");
        File file3 = new File("matrix3.txt");
        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();
        String filename1 = file1.getName();
        String filename2 = file2.getName();
        String filename3 = file3.getName();
      //  Write wobj = new Write();
        Write.writeMatrix(filename1, arr1);
        Write.writeMatrix(filename2, arr2);
        Write.writeMatrix(filename3, multi);
        
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file3.getAbsolutePath());
    }
}

class Write {
    static void writeMatrix(String filename, int[][] matrix) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    bw.write(matrix[i][j] + ",");
                }
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            System.out.println("File does not Exits....!");
        }
    }
}
