package File_Handling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class file_write {
    public static void main(String[] args) throws IOException {
        String s = "Pankaj Mahanto " + "213902002 " + "CSE";
        String dirname="C:";
        String filename="output.txt";
        File file=new File(dirname,filename);
        FileWriter fw=new FileWriter(file);

        for (int i = 0; i < s.length(); i++) {
            fw.write(s.charAt(i));
        }
        System.out.println("Writing Successfully!");
        fw.close();
    }
}
