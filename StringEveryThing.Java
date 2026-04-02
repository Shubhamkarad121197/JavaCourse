public class StringEveryThing {

    public static void main(String[] args) {

        // ================================
        // 1. STRING CREATION
        // ================================

        String s1 = "Hello"; 
        // Stored in String Constant Pool (SCP)

        String s2 = new String("Hello"); 
        // Creates a new object in Heap memory

        char[] arr = {'J', 'a', 'v', 'a'};
        String s3 = new String(arr);
        // Creating string from character array

        System.out.println("String Creation:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        // ================================
        // 2. IMMUTABILITY
        // ================================

        String str = "Hello";
        str.concat(" World"); 
        // concat() creates new string but does NOT modify original

        System.out.println("\nImmutability:");
        System.out.println(str); // Output: Hello


        // ================================
        // 3. LENGTH
        // ================================

        System.out.println("\nLength:");
        System.out.println(str.length()); 
        // Returns number of characters


        // ================================
        // 4. COMPARISON
        // ================================

        System.out.println("\nComparison:");
        System.out.println(str.equals("Hello")); 
        // true (value comparison)

        System.out.println(str.equalsIgnoreCase("hello")); 
        // true (ignores case)

        System.out.println(str.compareTo("Hi")); 
        // compares lexicographically


        // ================================
        // 5. ACCESS CHARACTERS
        // ================================

        System.out.println("\nCharacter Access:");
        System.out.println(str.charAt(0)); 
        // Returns character at index


        // ================================
        // 6. SUBSTRING
        // ================================

        System.out.println("\nSubstring:");
        System.out.println(str.substring(1, 4)); 
        // Extracts part of string (index 1 to 3)


        // ================================
        // 7. CONTAINS
        // ================================

        System.out.println("\nContains:");
        System.out.println(str.contains("ell")); 
        // Checks if substring exists


        // ================================
        // 8. REPLACE
        // ================================

        System.out.println("\nReplace:");
        System.out.println(str.replace("l", "x")); 
        // Replaces characters


        // ================================
        // 9. SPLIT
        // ================================

        System.out.println("\nSplit:");
        String sentence = "Java is awesome";
        String[] words = sentence.split(" "); 
        // Splits string into array

        for (String word : words) {
            System.out.println(word);
        }


        // ================================
        // 10. TRIM
        // ================================

        System.out.println("\nTrim:");
        String spaced = "  Hello  ";
        System.out.println(spaced.trim()); 
        // Removes leading and trailing spaces


        // ================================
        // 11. CASE CONVERSION
        // ================================

        System.out.println("\nCase Conversion:");
        System.out.println(str.toUpperCase()); 
        System.out.println(str.toLowerCase());


        // ================================
        // 12. == vs equals()
        // ================================

        System.out.println("\n== vs equals:");

        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b); 
        // true → same reference (SCP)

        System.out.println(a == c); 
        // false → different memory

        System.out.println(a.equals(c)); 
        // true → same value


        // ================================
        // 13. STRING INTERNING
        // ================================

        System.out.println("\nInterning:");

        String i1 = new String("Hello");
        String i2 = i1.intern(); 
        // Moves string to SCP

        System.out.println(i2 == "Hello"); 
        // true


        // ================================
        // 14. STRINGBUILDER
        // ================================

        System.out.println("\nStringBuilder:");

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); 
        // Efficient modification

        System.out.println(sb);


        // ================================
        // 15. REVERSE STRING
        // ================================

        System.out.println("\nReverse String:");

        String original = "Java";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); 
            // builds reversed string (slow)
        }

        System.out.println(reversed);

        // Optimized way
        StringBuilder sbRev = new StringBuilder(original);
        System.out.println(sbRev.reverse());


        // ================================
        // 16. PALINDROME CHECK
        // ================================

        System.out.println("\nPalindrome:");

        String palindrome = "madam";
        String rev = new StringBuilder(palindrome).reverse().toString();

        if (palindrome.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


        // ================================
        // 17. CHARACTER COUNT
        // ================================

        System.out.println("\nCharacter Count:");

        String countStr = "hello";

        for (int i = 0; i < countStr.length(); i++) {
            System.out.println(countStr.charAt(i)); 
            // prints each character
        }


        // ================================
        // 18. ESCAPE CHARACTERS
        // ================================

        System.out.println("\nEscape Characters:");

        System.out.println("Hello\nWorld"); // new line
        System.out.println("Hello\tWorld"); // tab
        System.out.println("\"Hello\"");    // double quote
        System.out.println("Hello\\World"); // backslash


        // ================================
        // 19. PERFORMANCE TEST
        // ================================

        System.out.println("\nPerformance Test:");

        String slow = "";

        for (int i = 0; i < 5; i++) {
            slow += i; 
            // Creates new object each time (slow)
        }

        System.out.println("Using String: " + slow);

        StringBuilder fast = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            fast.append(i); 
            // Efficient (no new object each time)
        }

        System.out.println("Using StringBuilder: " + fast);
    }
}