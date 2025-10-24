package week04;

class DefaultConstructor {
    int a; // instance variable

    void print() {
        System.out.println("The value of a is: " + a);
        System.out.println("The variable 'a' is automatically assigned to 0 by the default constructor.");
    }

    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        DefaultConstructor obj = new DefaultConstructor(); // default constructor called
        obj.print();
    }
}
