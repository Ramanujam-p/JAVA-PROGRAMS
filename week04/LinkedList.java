package week04;

public class LinkedList {

    // Private static nested Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head; // head of the linked list

    // Add node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null)
            current = current.next;
        current.next = newNode;
    }

    // Delete first node with given data
    public void delete(int data) {
        if (head == null)
            return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data)
            current = current.next;

        if (current.next != null)
            current.next = current.next.next;
    }

    // Display all nodes
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Search for a node with given data
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data)
                return true;
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("NAME: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.print("Linked List: ");
        list.display(); // Output: 10 20 30

        list.delete(20);
        System.out.print("After deleting 20: ");
        list.display(); // Output: 10 30

        System.out.println("Search 30: " + list.search(30)); // true
        System.out.println("Search 40: " + list.search(40)); // false
    }
}
