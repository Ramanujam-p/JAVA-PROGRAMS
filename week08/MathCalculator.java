package week08;

public class MathCalculator {
    public static double calculatepower(int base, int exponent) {
        if (base == 0 && exponent < 0)
            throw new IllegalArgumentException("base 0 with negative exponent is undefined");
        if (base < 0 && exponent < 0)
            throw new ArithmeticException("Both base and exponent with negative is undefined");
        if (base == 0 && exponent == 0)
            throw new UnsupportedOperationException("Both base and exponent are zero is undefined");
        return Math.pow(base, exponent);
    }

    public static long fact(int n) {
        if (n < 0)
            throw new IllegalArgumentException("when n is negative , it is undefined");
        if (n > 20)
            throw new ArithmeticException("overflow occurs");
        long f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    public static double safedivide(double dividend, double divisor) {
        if (divisor == 0.0)
            throw new ArithmeticException("division by zero");
        else if (dividend == 0.0 && divisor == 0.0)
            throw new IllegalArgumentException("when both dividend and divisor are zero");
        return dividend / divisor;
    }

    public static void main(String[] args) {
        System.out.println("REG NO: 2024503525 NAME:RAMANUJAM.P");
        // correct test cases
        System.out.println("power(2,3):" + calculatepower(2, 3));
        System.out.println("factorial of 5:" + fact(5));
        System.out.println("divide 4 and 2 is:" + safedivide(10, 2));
        // false test cases
        // 1. during calculation of power
        try {
            System.out.println("power(0,-1):" + calculatepower(0, -2));
        } catch (Exception e) {
            System.out.println("error message:" + e.getMessage());
        }
        try {
            System.out.println("power(-1,-1):" + calculatepower(-3, -2));
        } catch (Exception e) {
            System.out.println("error message:" + e.getMessage());
        }
        try {
            System.out.println("power(0,0):" + calculatepower(0, 0));
        } catch (Exception e) {
            System.out.println("error message:" + e.getMessage());
        }
        // 2.during factorial
        try {
            System.out.println("factorial of a negative number:" + fact(-5));
        } catch (Exception e) {
            System.out.println("error message:" + e.getMessage());
        }
        try {
            System.out.println("factorial of number above 20:" + fact(25));
        } catch (Exception e) {
            System.out.println("error message:" + e.getMessage());
        }
        try {
            System.out.println("division by zero:" + safedivide(5, 0));
        } catch (Exception e) {
            System.out.println("error message:" + e.getMessage());
        }
        try {
            System.out.println("0/0:" + safedivide(0, 0));
        } catch (Exception e) {
            System.out.println("error message:" + e.getMessage());
        }
    }
}
