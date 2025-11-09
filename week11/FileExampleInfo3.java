package week11;

//Reding the data character by character from the existing file using the file reader
import java.io.*;

public class FileExampleInfo3 {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("c:\\Users\\P.Ramanujam\\Desktop\\file1.txt");
            int a;
            while ((a = f.read()) != -1)
                System.out.print((char) a);
            f.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
