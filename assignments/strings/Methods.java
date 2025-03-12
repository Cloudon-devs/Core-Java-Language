package assignments.strings;

public class Methods {
    static void basics(String s1) {
        // 1. Length
        System.out.println("Length: " + s1.length());

        // 2. CharAt
        System.out.println("Char at 2: " + s1.charAt(2));

        // 3. Case changes
        System.out.println("To uppercase: " + s1.toUpperCase());
        System.out.println("To lowercase: " + s1.toLowerCase());

        // 4. Trimmming
        System.out.println("Trimmed: " + s1.trim());

        // 5. Equality check
        System.out.println("Equals: " + s1.equals("Hello"));
        System.out.println("EqualsIgnoreCase: " + s1.equalsIgnoreCase("hello"));

        // 6. Chaining
        System.out.println("Chaining: " + s1.trim().equalsIgnoreCase("hello"));
    }

    static void splitAndJoin(String s1) {
        // 1. Split
        System.out.println(s1.split(" "));

        // 2. Join
        System.out.println("Joined: " + s1.join("", s1));   
    }

    static void subsrting(String s1) {
        System.out.println(s1.substring(0, 8));
    }

    public static void main(String[] args) {
        String testStr = "   Hello  ";
        basics(testStr);
        splitAndJoin(testStr);
        subsrting(testStr);
    }
}