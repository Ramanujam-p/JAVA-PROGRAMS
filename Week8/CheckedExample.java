package Week8;

import java.io.*;

public class CheckedExample {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("nonexistent.txt");
        // may throw FileNotFoundException
        file.close();
    }
}
