package week01;

import java.util.*;

class arraypractices {
   public static void rev(int[] arr) {
      int start = 0;
      int end = arr.length - 1;
      while (start < end) {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of elements:");
      int a = sc.nextInt();
      int[] b = new int[a];
      System.out.println("enter the array elements:");
      for (int i = 0; i < a; i++)
         b[i] = sc.nextInt();
      System.out.println("The resultant array:" + Arrays.toString(b));
      rev(b);
      System.out.println("The reverse of the array is:" + Arrays.toString(b));
      Arrays.sort(b);
      System.out.println("The sorted array is:" + Arrays.toString(b));
      System.out.println("enter the element to search in the array");
      int element = sc.nextInt();
      System.out.println("The element found at:" + Arrays.binarySearch(b, element));
      System.out.println("enter the number of rows and columns:");
      int r = sc.nextInt();
      int c = sc.nextInt();
      int[][] z = new int[r][c];
      System.out.println("enter the elements:");
      for (int i = 0; i < r; i++) {
         for (int j = 0; j < c; j++) {
            z[i][j] = sc.nextInt();
         }
      }
      System.out.println("The two dimensional array is: " + Arrays.deepToString(z));
      int[] n = Arrays.copyOf(b, 5);
      int[] p = Arrays.copyOfRange(b, 2, 5);
      System.out.println("The resultant array:" + Arrays.toString(n));
      System.out.println("The resultant array:" + Arrays.toString(p));
      System.out.println("From which place the array was mismatching:" + Arrays.mismatch(n, p));
      System.out.println("From which place the array was mismatching:" + Arrays.hashCode(n));
      System.out.println("are the two array are equal or not:" + n.equals(p));
      int x[] = { 1, 2, 3 };
      int y[] = { 1, 2, 3 };
      if (x.equals(y))
         System.out.println("both are equal");
      else
         System.out.println("both are not equal");
      sc.close();
   }
}