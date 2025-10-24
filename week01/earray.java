package week01;

import java.util.*;

class earray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the first array:");
        int m = sc.nextInt();
        int[] a = new int[m];
        System.out.println("enter the array elements:");
        for (int i = 0; i < m; i++)
            a[i] = sc.nextInt();
        System.out.println("enter the size of the second array:");
        int n = sc.nextInt();
        int[] b = new int[n];
        System.out.println("enter the array elements:");
        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : a)
            if (num % 2 == 0)
                list.add(num);
        for (int num : b)
            if (num % 2 == 0)
                list.add(num);
        int[] c = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            c[i] = list.get(i);
        System.out.println("The even array is:" + Arrays.toString(c));
        sc.close();
    }
}