package gr.aueb.cf;

/*
Γράψτε μια μέθοδο που αντικαθιστά όλα τα κενά (' ') σε ένα String με "%20" (όπως γίνεται σε URLs)
• Παράδειγμα Εισόδου:
• "Καλή σταδιοδρομία σε όλους"
• Αναμενόμενη Έξοδος:
• "Καλή%20σταδιοδρομία%20σε%20όλους"
 */
public class URLEncoderReplace18 {


    public static void main(String[] args) {
        String input = "Καλή σταδιοδρομία σε όλους";

        String result = replaceSpaces(input);

        System.out.println("Είσοδος: \"" + input + "\"");
        System.out.println("Έξοδος: \"" + result + "\"");
    }

    public static String replaceSpaces(String str) {
        if (str == null) {
            return null;
        }

        return str.replace(" ", "%20");
    }
}



