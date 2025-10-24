package week01;

class book {
    private String title, author;
    private int price, yearOfPublication, dayslate, fineperday;

    book(String a, String b, int c, int d, int f) {
        title = a;
        author = b;
        price = c;
        yearOfPublication = d;
        fineperday = f;
    }

    void setdayslate(int sdl) {
        dayslate = sdl;
    }

    int totalfine() {
        int total = fineperday * dayslate;
        return total;
    }

    void display() {
        System.out.println("____library management system_____\n1.Book title:" + title + "\n2.book author:" + author
                + "\n3.book price:" + price + "\n4.year of publication:" + yearOfPublication + "\n5.fine per day:"
                + fineperday + "\ntotal fine:" + totalfine());
    }
}

public class lms {
    public static void main(String[] args) {
        book o = new book("rama", "harish", 1000, 2007, 100);
        o.setdayslate(10);
        o.display();
    }
}