package week04;

public class Access {

    // Private inner class
    private class A {
        void display() {
            System.out.println("This is the display method of private class A");
        }
    }

    // Public inner class
    public class B {
        void show() {
            System.out.println("This is the show method of public class B");
        }
    }

    // Method to access private class A
    void accessPrivate() {
        A a = new A();
        a.display();
    }

    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        Access outer = new Access();

        // Access private inner class via outer class method
        outer.accessPrivate();

        // Access public inner class
        B b = outer.new B();
        b.show();

        System.out.println("This is the main method of Access class.");
        System.out.println("End of main method.");
    }
}
