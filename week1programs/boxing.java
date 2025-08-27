package week1programs;
import java.util.*;
public class boxing {
    public static void main(String[] args)
    {
        int a = 20;
        Integer b = Integer.valueOf(a); //boxing
        Integer c = a; //autoboxing
        System.out.println("The integer value is:"+b+" "+c);
        int d = b.intValue(); //unboxing
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        int z = list.get(0); //autounboxing
        System.out.println("The integer value is:"+d+" "+z);
        List<String> names = new ArrayList<>();
        names.add("hello");
        names.add("hi");
        names.add("welcome");
        names.add("java");
        System.out.println("The names are:"+names);
        Collections.sort(names);
        System.out.println("The sorted names are:"+names);
        Collections.reverse(names);
        System.out.println("The reversed names are:"+names);
        Collections.shuffle(names);
        System.out.println("The shuffled names are:"+names);
        Collections.swap(names,0,2);
        System.out.println("The swapped names are:"+names);
         Collections.sort(names);
        System.out.println("The sorted names are:"+names);
        int index = Collections.binarySearch(names,"hi");
        System.out.println("The index of the element is:"+index);

    }
}
