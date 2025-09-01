package gr.aueb.cf;

import java.util.Arrays;

public class AnagramChecker14 {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        boolean result = areAnagrams(word1, word2);

        System.out.println("Λέξη 1: " + word1);
        System.out.println("Λέξη 2: " + word2);
        System.out.println("Είναι αναγραμματισμοί; " + result);
        System.out.println("Αναμενόμενο: true");
    }
}
