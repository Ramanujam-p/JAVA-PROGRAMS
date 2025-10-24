package week07;

public class Complexnumber {
    private double real;
    private double imaginary;

    public Complexnumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition
    public Complexnumber add(Complexnumber obj) {
        double treal = this.real + obj.real;
        double timag = this.imaginary + obj.imaginary;
        return new Complexnumber(treal, timag);
    }

    // Subtraction
    public Complexnumber sub(Complexnumber obj) {
        double treal = this.real - obj.real;
        double timag = this.imaginary - obj.imaginary;
        return new Complexnumber(treal, timag);
    }

    // Multiplication
    public Complexnumber mul(Complexnumber obj) {
        double treal = (this.real * obj.real) - (this.imaginary * obj.imaginary);
        double timag = (this.real * obj.imaginary) + (this.imaginary * obj.real);
        return new Complexnumber(treal, timag);
    }

    // Division
    public Complexnumber div(Complexnumber obj) {
        double denominator = (obj.real * obj.real) + (obj.imaginary * obj.imaginary);
        double treal = ((this.real * obj.real) + (this.imaginary * obj.imaginary)) / denominator;
        double timag = ((this.imaginary * obj.real) - (this.real * obj.imaginary)) / denominator;
        return new Complexnumber(treal, timag);
    }

    // Equality check
    public boolean isequal(Complexnumber obj) {
        return this.real == obj.real && this.imaginary == obj.imaginary;
    }

    // Override toString
    public String toString() {
        if (imaginary < 0)
            return real + "" + imaginary + "i";
        else
            return real + "+" + imaginary + "i";
    }

    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM\nREG NO: 2024503525");

        Complexnumber c1 = new Complexnumber(3, 4);
        Complexnumber c2 = new Complexnumber(1, -2);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        Complexnumber sum = c1.add(c2);
        Complexnumber diff = c1.sub(c2);
        Complexnumber prod = c1.mul(c2);
        Complexnumber quot = c1.div(c2);

        System.out.println("Sum: " + sum);
        System.out.println("Subtract: " + diff);
        System.out.println("Multiply: " + prod);
        System.out.println("Divide: " + quot);

        System.out.println("c1 equals c2? " + c1.isequal(c2));
    }
}
