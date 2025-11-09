package week11;

//Creating the file and important file methods
import java.io.*;

public class FileExampleInfo {
    public static void main(String[] args) {
        try {
            File f = new File("c:\\Users\\P.Ramanujam\\Desktop\\file1.txt");
            if (f.createNewFile())
                System.out.println("File created successfully! File name is:" + f.getName());
            else
                System.out.println("File already exists");
            System.out.println("Absoulute path of the file1:" + f.getAbsolutePath() + "\nReadable or not:" + f.canRead()
                    + "\nwritable or not:" + f.canWrite() + "\nLength of the file:" + f.length());
        } catch (IOException e) {
            System.out.println("An error occurred");
        }

    }
}
