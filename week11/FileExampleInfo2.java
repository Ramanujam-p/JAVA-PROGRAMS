package week11;

//writing into the file in append mode
import java.io.*;

public class FileExampleInfo2 {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("c:\\Users\\P.Ramanujam\\Desktop\\file1.txt", true);
            f.write("Hello everyone! I am ramanujam ");
            f.close();
            System.out.println("Successfully append to the file");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
