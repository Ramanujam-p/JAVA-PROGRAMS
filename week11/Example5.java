package week11;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String m) {
        super(m);
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String m) {
        super(m);
    }
}

class student {
    String name;
    int roll;
    int marks;

    public student(String name, int roll, int marks) throws InvalidMarksException, InvalidNameException {
        validatename(name);
        this.name = name;
        validatemark(marks);
        this.marks = marks;
        this.roll = roll;
    }

    void validatename(String a) throws InvalidNameException {
        int n = a.length();
        for (int i = 0; i < n; i++)
            if (!Character.isLetter(a.charAt(i)))
                throw new InvalidNameException("The name is invalid");
    }

    void validatemark(int a) throws InvalidMarksException {
        if (a < 0 || a > 100)
            throw new InvalidMarksException("Invalid mark");
    }

    void display() {
        System.out.println("Name:" + name + "\nroll no:" + roll + "\nMarks:" + marks);
    }
}

public class Example5 {
    public static void main(String[] args) {
        try {
            student s = new student("rama", 27, 67);

            s.display();

        } catch (InvalidMarksException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (InvalidNameException e) {
            System.out.println("error:" + e.getMessage());
        }
    }
}
