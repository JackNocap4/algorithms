package gr.aueb.cf;

/*
Γράψτε μια μέθοδο που δέχεται ένα String και επιστρέφει το αντεστραμμένο του (reversed)
• Παράδειγμα Εισόδου: " Athens"
• Αναμενόμενη Έξοδος: "snehtA"
 */
public class ReversedString12 {

    public static void main(String[] args) {
        String text = "Athens";
        String reversed = reverse(text);

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
