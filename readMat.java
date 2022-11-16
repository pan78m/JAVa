package File_Handling;

import java.io.File;
import java.util.Scanner;

public class readMat {
    public static void main(String[] args) {
        try {
            // Uploading files
            File file1 = new File("C:/New folder (2)/JAV/Lab_03/matrix1.txt");
            Scanner scanner1 = new Scanner(file1);

            File file2 = new File("C:/New folder (2)/JAV/Lab_03/matrix2.txt");
            Scanner scanner2 = new Scanner(file2);

            File file3 = new File("C:/New folder (2)/JAV/Lab_03/matrix3.txt");
            Scanner scanner3 = new Scanner(file3);
            // Reading file 1
            while (scanner1.hasNext()) {
                String matrix1 = scanner1.next();
                System.out.println("MATRIX 1=" + matrix1);
            }
            scanner1.close();

            System.out.println("\n");
            // Reading file 2
            while (scanner2.hasNext()) {
                String matrix2 = scanner2.next();
                System.out.println("MATRIX 2=" + matrix2);
            }
            scanner2.close();

            System.out.println("\n");
            // Reading file 3
            while (scanner3.hasNext()) {

                String matrix3 = scanner3.next();

                System.out.println("MATRIX MULTIPLICATION =" + matrix3);
            }
            scanner3.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
