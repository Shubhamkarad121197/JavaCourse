public class StringEverything {

    public static void main(String[] args) {

        // 1. String Creation
        String s1 = "Hello"; // SCP
        String s2 = new String("Hello"); // Heap
        char[] arr = {'J', 'a', 'v', 'a'};
        String s3 = new String(arr);

        System.out.println("String Creation:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // 2. Immutability
        String str = "Hello";
        str.concat(" World");
        System.out.println("\nImmutability:");
        System.out.println(str); // Hello

        // 3. Length
        System.out.println("\nLength:");
        System.out.println(str.length());

        // 4. Compare
        System.out.println("\nComparison:");
        System.out.println(str.equals("Hello"));
        System.out.println(str.equalsIgnoreCase("hello"));
        System.out.println(str.compareTo("Hi"));

        // 5. Access Characters
        System.out.println("\nCharacter Access:");
        System.out.println(str.charAt(0));

        // 6. Substring
        System.out.println("\nSubstring:");
        System.out.println(str.substring(1, 4));

        // 7. Contains
        System.out.println("\nContains:");
        System.out.println(str.contains("ell"));

        // 8. Replace
        System.out.println("\nReplace:");
        System.out.println(str.replace("l", "x"));

        // 9. Split
        System.out.println("\nSplit:");
        String sentence = "Java is awesome";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. Trim
        System.out.println("\nTrim:");
        String spaced = "  Hello  ";
        System.out.println(spaced.trim());

        // 11. Case Conversion
        System.out.println("\nCase Conversion:");
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // 12. == vs equals()
        System.out.println("\n== vs equals:");
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);       // true
        System.out.println(a == c);       // false
        System.out.println(a.equals(c));  // true

        // 13. String Interning
        System.out.println("\nInterning:");
        String i1 = new String("Hello");
        String i2 = i1.intern();
        System.out.println(i2 == "Hello"); // true

        // 14. StringBuilder
        System.out.println("\nStringBuilder:");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        // 15. Reverse String
        System.out.println("\nReverse String:");
        String original = "Java";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println(reversed);

        // Optimized reverse
        StringBuilder sbRev = new StringBuilder(original);
        System.out.println(sbRev.reverse());

        // 16. Palindrome Check
        System.out.println("\nPalindrome:");
        String palindrome = "madam";
        String rev = new StringBuilder(palindrome).reverse().toString();

        if (palindrome.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // 17. Count Characters
        System.out.println("\nCharacter Count:");
        String countStr = "hello";
        for (int i = 0; i < countStr.length(); i++) {
            System.out.println(countStr.charAt(i));
        }

        // 18. Escape Characters
        System.out.println("\nEscape Characters:");
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tWorld");
        System.out.println("\"Hello\"");
        System.out.println("Hello\\World");

        // 19. Performance Example
        System.out.println("\nPerformance Test:");

        String slow = "";
        for (int i = 0; i < 5; i++) {
            slow += i;
        }
        System.out.println("Using String: " + slow);

        StringBuilder fast = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            fast.append(i);
        }
        System.out.println("Using StringBuilder: " + fast);
    }
}