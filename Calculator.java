import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,r;
        do{
          System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.exit");
          System.out.println("enter your choice:");
          c = sc.nextInt();
         if(c==1)
         {
            System.out.println("enter two numbers:");
            a = sc.nextInt();
            b = sc.nextInt();
            r = a+b;
            System.out.println("result:"+r);
         }
         else if(c==2)
         {
            System.out.println("enter two numbers:");
            a = sc.nextInt();
            b = sc.nextInt();
            r = a-b;
            System.out.println("result:"+r);
         }
         else if(c==3)
         {
            System.out.println("enter two numbers:");
            a = sc.nextInt();
            b = sc.nextInt();
            r = a*b;
            System.out.println("result:"+r);
         }
         else if(c==4)
         {
            System.out.println("enter two numbers:");
            a = sc.nextInt();
            b = sc.nextInt();
            r = a/b;
            System.out.println("result:"+r);
         }
         else if(c==5)
         {
            System.out.println("program ended successfully");
            break;
         }
         else System.out.println("invalid choice");
        }while(c!=5);
        sc.close();
    }
}
