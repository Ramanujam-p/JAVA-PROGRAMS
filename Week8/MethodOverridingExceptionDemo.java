package Week8;
class SuperClass {
    public void performTask() throws Exception {
        System.out.println("SuperClass: Performing a task that might throw Exception");
    }
}
class SubClass extends SuperClass {
    @Override
    public void performTask() {
        System.out.println("SubClass: Performing a task that might throw ArithmeticException");
        throw new ArithmeticException("Division by zero occurred!");
    }
}

public class MethodOverridingExceptionDemo {
    public static void main(String[] args) {
        System.out.println("REG NO: 2024503525 NAME:RAMANUJAM.P");
        SuperClass obj = new SubClass();
        try {
            obj.performTask();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

