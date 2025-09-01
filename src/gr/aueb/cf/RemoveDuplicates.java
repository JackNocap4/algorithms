package gr.aueb.cf;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str1 = "aabbcc";
        String str2 = "Hello World!";

        System.out.println("Είσοδος: \"" + str1 + "\"");
        System.out.println("Έξοδος: \"" + removeDuplicates(str1) + "\"");
        System.out.println();

        System.out.println("Είσοδος: \"" + str2 + "\"");
        System.out.println("Έξοδος: \"" + removeDuplicates(str2) + "\"");
    }


    public static String removeDuplicates(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            // Ελέγχουμε αν ο χαρακτήρας δεν υπάρχει ήδη στο result
            if (sb.indexOf(String.valueOf(currentChar)) == -1) {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}
