import java.util.*;
public class Prog1 {
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.password verification\n2.factorial of a number\n3.add and subtract the two matrices\n4.exit");
            System.out.println("enter your choice");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                //atleast 7 characters long 
                //contain upper and lower case letters
                System.out.println("enter the password:");
                String password = sc.next();
                if(password.length()>=7 && !password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase()))
                    System.out.println("valid password");
                else
                    System.out.println("invalid password");
                break;
                case 2:
                System.out.println("enter the number:");
                int n = sc.nextInt();
                int fact = 1;
                for(int i=1;i<=n;i++)
                    fact = fact*i;
                System.out.println("factorial of "+n+" is "+fact);
                break;
                case 3:
                System.out.println("enter the number of rows and columns of the matrices:");
                int r = sc.nextInt();
                int c = sc.nextInt();
                int[][] a = new int[r][c];
                int[][] b = new int[r][c];
                int[][] s = new int[r][c];
                int[][] d = new int[r][c];
                System.out.println("enter the elements for the first matrix:");
                for(int i=0;i<r;i++)
                    for(int j=0;j<c;j++)
                        a[i][j] = sc.nextInt();
                System.out.println("enter the elements for the second matrix:");
                for(int i=0;i<r;i++)
                    for(int j=0;j<c;j++)
                        b[i][j] = sc.nextInt();
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                          s[i][j] = a[i][j]+b[i][j];
                          d[i][j] = a[i][j]-b[i][j];
                    }
                }
                System.out.println("The sum of the matrix:");
                for(int i=0;i<r;i++)
                {
                    for(int j=0;j<c;j++)
                    {
                        System.out.print(s[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println("The sub of the matrix");
                for(int i=0;i<r;i++)
                    {
                    for(int j=0;j<c;j++)
                    {
                        System.out.print(d[i][j]+" ");
                    }
                    System.out.println();
                }
                case 4:
                System.out.println("exiting...");
                break;
            }           
            sc.close();
    }
}
