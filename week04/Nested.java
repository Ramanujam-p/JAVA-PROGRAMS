package week04;

class Nested {

    // Private static nested class
    private static class A {
        void display() {
            System.out.println("This is the display method of private static class A");
        }
    }

    // Public static nested class
    public static class B {
        void show() {
            System.out.println("This is the show method of public static class B");
        }
    }

    // Method to access private static class A
    void accessPrivate() {
        A a = new A();
        a.display();
    }

    // Corrected main method signature
    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        Nested obj = new Nested();
        obj.accessPrivate(); // access private class A via instance method

        B b = new B(); // access public static class B directly
        b.show();

        System.out.println("This is the main method of the Nested class.");
        System.out.println("End of main method.");
    }
}
