import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SequentialNumberIO {
    public static void main(String[] args) {
        String filename = "numbers.txt";

        // Writing numbers to file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (int i = 1; i <= 10; i++) {
                dos.writeInt(i);
            }
            System.out.println("Numbers written to file successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Reading numbers from file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("Numbers read from file:");
            while (dis.available() > 0) {
                int num = dis.readInt();
                System.out.print(num + " ");
            }
            System.out.println("\nP.RAMANUJAM 2024503525");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
