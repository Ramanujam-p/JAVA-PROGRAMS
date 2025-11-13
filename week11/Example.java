package week11;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();// ordered,duplicates allowed
        a.add(10);
        a.add(20);
        a.add(30);
        for (int b : a)
            System.out.println(b);
        HashSet<String> c = new HashSet<>();// unique elements,unordered
        c.add("Rama");
        c.add("Harish");
        c.add("sita");
        for (String d : c)
            System.out.println(d);
        HashMap<Integer, String> e = new HashMap<>();// key value pairs
        e.put(1, "One");
        e.put(2, "two");
        e.put(3, "three");
        for (HashMap.Entry<Integer, String> obj : e.entrySet())
            System.out.println(obj.getKey() + " " + obj.getValue());
    }
}
