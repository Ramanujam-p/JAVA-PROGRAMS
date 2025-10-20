package week1;

class Pro1 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 1, 2, 3 };
        if (a.equals(b))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}// reference comparison, not content comparison
 // use Arrays.equals for content comparison
 // output: Not Equal