package Week8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Class to process file content
class FileProcessor {

    // Method to read a file; it declares that it throws FileNotFoundException
    public void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file); // this may throw FileNotFoundException

        System.out.println("Reading from file: " + fileName);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }

    // Method that calls readFile and propagates the exception further
    public void processFile(String fileName) throws FileNotFoundException {
        System.out.println("Processing file...");
        readFile(fileName); // exception can propagate from here
    }
}

public class FileProcessingSystem {

    public static void main(String[] args) {
         System.out.println("REG NO: 2024503525 NAME:RAMANUJAM.P");
        FileProcessor processor = new FileProcessor();

        try {
            processor.processFile("sample.txt"); // calling method that propagates exception
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
            System.out.println("Detailed message: " + e.getMessage());
        }
    }
}
