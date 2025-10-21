package week4;

class Parameterizedconstructor {
    String name;
    int age;

    Parameterizedconstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");
        Parameterizedconstructor obj = new Parameterizedconstructor("Rama", 18);
        obj.display();
    }
}
