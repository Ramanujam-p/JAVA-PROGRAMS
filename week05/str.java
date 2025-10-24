package week05;

public class str {
    public static void main(String[] args) {
        System.out.println("Name: P.RAMANUJAM");
        System.out.println("REG NO: 2024503525\n");

        String s1 = "Welcome To Java";
        String s2 = s1;
        String s3 = new String("Welcome To Java");
        String s4 = s1.intern();
        String s = "    hi";

        // Comparing references using ==
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1 == s4: " + (s1 == s4));
        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s2 == s4: " + (s2 == s4));
        System.out.println("s3 == s4: " + (s3 == s4));

        // Comparing contents using equals()
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("s1 equals s4: " + s1.equals(s4));
        System.out.println("s2 equals s3: " + s2.equals(s3));

        // Ignore case
        System.out.println("Ignore case for s1 and s2: " + s1.equalsIgnoreCase(s2));

        // Comparison
        System.out.println("The comparison of s1 and s2: " + s1.compareTo(s2));
        System.out.println("The comparison of s2 and s3: " + s2.compareTo(s3));

        // Substrings
        System.out.println("Substring of s1 starting from index 3: " + s1.substring(3));
        System.out.println("Substring of s1 from index 1 to 3: " + s1.substring(1, 3));

        // StartsWith / EndsWith
        System.out.println("s1 starts with 'Wel': " + s1.startsWith("Wel"));
        System.out.println("s1 ends with 'Java': " + s1.endsWith("Java"));

        // Uppercase / Lowercase
        System.out.println("s1 uppercase: " + s1.toUpperCase());
        System.out.println("s1 lowercase: " + s1.toLowerCase());

        // Replace methods
        System.out.println("s1 replace 'o' with 'O': " + s1.replace('o', 'O'));
        System.out.println("s1 replaceAll 'o' with 'O': " + s1.replaceAll("o", "O"));
        System.out.println("s1 replaceFirst 'o' with 'O': " + s1.replaceFirst("o", "O"));

        // Trim
        System.out.println("Trimmed s: '" + s.trim() + "'");

        // Split
        String[] c = s1.split("o");
        System.out.println("Split s1 by 'o':");
        for (String d : c) {
            System.out.println(d);
        }

        String[] a = s1.split("o", 2);
        System.out.println("Split s1 by 'o' with limit 2:");
        for (String b : a) {
            System.out.println(b);
        }

        // Unicode
        System.out.println("Unicode of character at position 1 in s1: " + s1.codePointAt(1));

        // Convert to char array
        System.out.println("s1 to char array:");
        char[] e = s1.toCharArray();
        for (char f : e) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Contains
        System.out.println("s1 contains 'Java': " + s1.contains("Java"));
        System.out.println("s1 contains 'java': " + s1.contains("java"));

        // Identity hash codes
        System.out.println("Identity hash code of s1: " + System.identityHashCode(s1));
        System.out.println("Identity hash code of s2: " + System.identityHashCode(s2));
        System.out.println("Identity hash code of s3: " + System.identityHashCode(s3));
        System.out.println("Identity hash code of s4: " + System.identityHashCode(s4));
    }
}
