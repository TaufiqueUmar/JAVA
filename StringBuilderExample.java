public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(" World");
        System.out.println("Appended String: " + sb.toString());

        // Insert
        sb.insert(5, ",");
        System.out.println("Inserted String: " + sb.toString());

        // Replace
        sb.replace(6, 11, "Java");
        System.out.println("Replaced String: " + sb.toString());

        // Delete
        sb.delete(5, 6);
        System.out.println("Deleted String: " + sb.toString());

        // Length
        System.out.println("Length: " + sb.length());
    }
}


public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // Length
        System.out.println("Length: " + str3.length());

        // Substring
        System.out.println("Substring (0-5): " + str3.substring(0, 5));

        // Character at specific index
        System.out.println("Character at index 1: " + str3.charAt(1));
    }
}
