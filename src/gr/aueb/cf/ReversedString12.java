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

    public static String reverse(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
