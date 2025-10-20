package week1;

class Cla {
    public static void main(String[] args) {
        if (args.length > 0)
            System.out.println("present");
        for (String a : args)
            System.out.println(a);
    }
}