package week4;

class Instantiation {
    // Static method
    static void staticMethod() {
        System.out.println("This is the class-level method (called without an object).");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is the object-level method (called using an object).");
    }

    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        Instantiation obj = new Instantiation();

        // Calling static method directly (class-level)
        staticMethod();

        // Calling instance method using object
        obj.instanceMethod();
    }
}
