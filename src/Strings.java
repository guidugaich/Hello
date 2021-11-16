public class Strings {
    public static void main(String[] args) {
        String msg = "Hello World";
        System.out.println(msg.endsWith("rld")); // returns true
        System.out.println(msg.length()); // returns 11
        System.out.println(msg.indexOf("H")); // returns 0
        System.out.println(msg.replace("Hello", "Goodbye")); // Goodbye World

        // Strings are immutable!

        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());

        System.out.println("Hello \"Guilherme\""); // prints the doulbe quotes
        System.out.println("C:\\Windows\\Users..."); // prints the backslashes
        System.out.println("Bom\nDia"); // breaks the line
    }
}
