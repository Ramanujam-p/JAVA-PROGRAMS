package week1programs;
import java.util.*;
public class earray {
    public static void main(String[] args)
    {
        // give a java program that find the even elements between two array and create a third array with those even elements
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the first array:");
        int n = sc.nextInt();               
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.println("enter the number of elements in the second array:");
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i=0;i<m;i++)
            b[i] = sc.nextInt();
        ArrayList<Integer> evenList = new ArrayList<>();
        for(int num : a) {  
            if(num % 2 == 0) {
                evenList.add(num);
            }
        }
        for(int num : b) {
            if(num % 2 == 0) {
                evenList.add(num);
            }
        }
        int[] evenArray = new int[evenList.size()];
        for(int i = 0; i < evenList.size(); i++) {
            evenArray[i] = evenList.get(i);
        }
        System.out.println("The even elements array: " + Arrays.toString(evenArray));
        sc.close();  
    }
}
