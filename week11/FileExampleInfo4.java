package week11;

import java.io.*;

//reads the data line by line from the existing file using BufferedReader
public class FileExampleInfo4 {
    public static void main(String[] args) {
        try {
            BufferedReader b = new BufferedReader(new FileReader("c:\\Users\\P.Ramanujam\\Desktop\\file1.txt"));
            String a;
            while ((a = b.readLine()) != null)
                System.out.println(a);
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
