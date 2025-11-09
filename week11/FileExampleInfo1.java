package week11;

//writing into the file in overwrite mode
import java.io.*;

public class FileExampleInfo1 {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("c:\\Users\\P.Ramanujam\\Desktop\\file1.txt");
            f.write("This is the song for my broken heart");
            f.close();
            System.out.println("file written successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
