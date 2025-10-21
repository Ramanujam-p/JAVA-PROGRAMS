package week4;

class Static {
    static int a; // declare static variable with a data type

    // static block (runs once when the class is loaded)
    static {
        a = 0;
    }

    // constructor (runs each time an object is created)
    Static() {
        a++;
    }

    // static method
    static void call() {
        System.out.println("The phone rang");
    }

    // static method calling another static method
    static void receive() {
        call();
        System.out.println("The ringing phone is picked up");
    }

    // instance method
    void display() {
        System.out.println("The value of a is: " + a);
    }

    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        Static obj1 = new Static();
        receive(); // static method call
        obj1.display(); // instance method call
    }
}
