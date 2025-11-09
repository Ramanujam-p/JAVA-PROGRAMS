package week11;

//read and write the data into a binary file
//read and write the primita data into a binary file
import java.io.*;

public class FileExampleInfo5 {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("c:\\Users\\P.Ramanujam\\Desktop\\binary1.dat");
            f.write(65);
            f.close();
            FileInputStream f1 = new FileInputStream("c:\\Users\\P.Ramanujam\\Desktop\\binary1.dat");
            int a = f1.read();
            System.out.println("Data that is read from the file:" + (char) a);
            f1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            DataOutputStream d1 = new DataOutputStream(
                    new FileOutputStream("c:\\Users\\P.Ramanujam\\Desktop\\binary2.dat"));
            d1.writeInt(256);
            d1.writeDouble(45.11);
            d1.writeBoolean(false);
            d1.close();
            System.out.println("data written successfully into the binary file");
            DataInputStream d2 = new DataInputStream(
                    new FileInputStream("c:\\Users\\P.Ramanujam\\Desktop\\binary2.dat"));
            int x = d2.readInt();
            double y = d2.readDouble();
            boolean z = d2.readBoolean();
            System.out.println("Data read from the binary file:");
            System.out.println("Integer data:" + x + " Double data:" + y + " Boolean data:" + z);
            d2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}