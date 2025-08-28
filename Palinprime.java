import java.util.*;
public class Palinprime
{
    public static boolean isprime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
            return true;
    }
    public static boolean ispalin(int n)
    {
        int r=0,s=0,t=n;
        while(n!=0)
        {
            int d = n%10;
            r = (r*10)+d;
            n = n/10;
        }
        return r==t;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Palinprime numbers between "+m+" and "+n+" are:");
        for(int i=m;i<=n;i++)
        {
            if(isprime(i) && ispalin(i))
                System.out.print(i+" ");
        }
        sc.close();
    }
}