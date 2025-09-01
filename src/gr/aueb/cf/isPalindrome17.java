package gr.aueb.cf;

public class isPalindrome17 {

    public static void main(String[] args) {
        String input = "νίψον ανομήματα μη μόναν όψιν";

        System.out.println("Είσοδος: \"" + input + "\"");
        System.out.println("Είναι παλίνδρομο; " + isPalindrome(input));
        System.out.println("Αναμενόμενο: true");

        // Άλλα παραδείγματα
        System.out.println("\nΆλλα παραδείγματα:");
        System.out.println("\"madam\": " + isPalindrome("madam"));
        System.out.println("\"hello\": " + isPalindrome("hello"));
        System.out.println("\"Αβα\": " + isPalindrome("Αβα"));

    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Αφαίρεση κενών και μετατροπή σε lowercase
        String cleaned = str.replaceAll("\\s", "").toLowerCase();

        // Αντιστροφή και έλεγχος
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

}
