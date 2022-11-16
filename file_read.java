package File_Handling;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
public class file_read {
    public static void main(String[] args) throws IOException {
        int i;
       // String s = "Pankaj Mahanto " + "213902002 " + "CSE";
        String dirname="C:";
        String filename="output.txt";
        File file=new File(dirname,filename);
        

        FileReader fr = null;

        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("File not found!!");
        }
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println("\n");
        System.out.println("Writing Successfully!");
        fr.close();
    }
}
