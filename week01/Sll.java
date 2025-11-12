package week01;

public class Sll {
    static class node {
        char data;
        node next;

        node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private node head;

    public void add(char data) {
        node a = new node(data);
        if (head == null) {
            head = a;
            return;
        }
        node c = head;
        while (c.next != null)
            c = c.next;
        c.next = a;
    }

    public void remove(char k) {
        if (head == null) {
            System.out.println("there is nothing to remove in the linked list!");
            return;
        }
        if (head.data == k) {
            head = head.next;
            return;
        }
        node c = head;
        node p = null;
        while (c != null && c.data != k) {
            p = c;
            c = c.next;
        }
        if (c == null) {
            System.out.println("character" + k + "not found in the list");
            return;
        }
        p.next = c.next;
        System.out.println("Removed " + k + " from the list");
    }

    public boolean search(char k) {
        node c = head;
        while (c != null) {
            if (c.data == k)
                return true;
            c = c.next;
        }
        return false;
    }

    public void r() {
        node p = null;
        node c = head;
        node a;
        while (c != null) {
            a = c.next;
            c.next = p;
            p = c;
            c = a;
        }
        head = p;
        System.out.println("list reversed");
    }

    public void display() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        node c = head;
        while (c != null) {
            System.out.print(c.data + "->");
            c = c.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        Sll l = new Sll();
        l.add('A');
        l.add('B');
        l.add('C');
        l.add('D');
        l.display();
        char s = 'C';
        System.out.println("Searching for " + s + " :" + l.search(s));
        l.remove('B');
        l.r();
        l.display();
    }

}
