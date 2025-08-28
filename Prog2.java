import java.util.*;
public class Prog2 {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the string:");
      String s = sc.nextLine();
      s = s.toLowerCase();
      boolean a[] = new boolean[26];
      for(int i=0;i<s.length();i++)
      {
        char c = s.charAt(i);
        if(c>='a'&&c<='z')
          a[c - 'a'] = true;
      }
      for(int i=0;i<26;i++)
      {
        if(a[i]==false)
        {
          System.out.println("The given string is not a pangram");
          return;
        }
      }
        System.out.println("The given string is a pangram");
        sc.close();
    }
}
