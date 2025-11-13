package week11;

public class Example6 {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + ". Hello I am rama");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
    }
}
