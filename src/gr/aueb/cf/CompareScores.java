package gr.aueb.cf;

/* Δίνονται δύο πίνακες με 3 βαθμολογίες κάθε ένας. Συγκρίνετε τις βαθμολογίες και επιστρέψτε τους πόντους κάθε παίκτη
• Έστω οι Alice και Bob αξιολογούνται σε 3 κατηγορίες (π.χ., Μουσική, Προγραμματισμός, Γρήγορη Σκέψη). Κάθε κατηγορία
  δίνει βαθμολογία από 1 έως 100.
• Αν η Alice έχει μεγαλύτερη βαθμολογία σε μια κατηγορία, παίρνει 1 πόντο. Αν ο Bob έχει μεγαλύτερη βαθμολογία,παίρνει
  εκείνος 1 πόντο. Αν είναι ίσοι, κανείς δεν παίρνει πόντο.
• Επιστροφή: Πίνακας με 2 θέσεις [πόντοι_Alice, πόντοι_Bob]
*/

import java.util.Arrays;

public class CompareScores {

    public static void main(String[] args) {

        int[] aliceScores1 = {45, 99, 79} ;
        int[] bobScores1 = {98 , 96, 44} ;


        int[] result = compareScores(aliceScores1,bobScores1);
        System.out.println("Alice : " + Arrays.toString(aliceScores1));
        System.out.println("Bob : " + Arrays.toString(bobScores1));
        System.out.println("Αποτελέσματα: [Alice]" + result[0] + ", Bob: " + result[1] + "]");

    }

    public static int[] compareScores(int[] aliceScores, int[] bobScores) {
        if (aliceScores == null || bobScores == null ||
            aliceScores.length != bobScores.length ) {
            throw new IllegalArgumentException("Λάθος είσοδος");
        }

        int alicePoints = 0;
        int bobPoints = 0;

        for (int i = 0; i < aliceScores.length; i++) {
            if (aliceScores[i] > bobScores[i]) {
                alicePoints++;
            }else if (bobScores[i] > aliceScores[i]) {
                bobPoints++;
            }
        }

        return new int[] {alicePoints,bobPoints};
    }
}
