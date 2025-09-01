package gr.aueb.cf.ex6;

import java.util.Arrays;

/*Δίνεται ένας πίνακας ακεραίων. Να υπολογιστούν οισυχνότητες (με 6 δεκαδικά ψηφία) των: Θετικών αριθμών (> 0).
Αρνητικών αριθμών (< 0). Μηδενικών (== 0).
• Παράδειγμα:
• int[] arr = {1, -2, 0, 3, 0, -4};
• Έξοδος
0.333333 // Θετικά (2/6)
0.333333 // Αρνητικά (2/6)
0.333333 // Μηδενικά (2/6)
 */
public class Ex6 {

    public static void main(String[] args) {

        int[] arr = {1, -2, 0, 3, 0, -4};
        System.out.println("Arrays: " + Arrays.toString(arr));


        calculateFrequencies(arr);
    }

    public static void calculateFrequencies(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Ο πίνακας είναι κενός");
            return;
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        int n = arr.length;
        double positiveFreq = (double) positiveCount / n;
        double negativeFreq = (double) negativeCount / n;
        double zeroFreq = (double) zeroCount / n;

        // Εκτύπωση με 6 δεκαδικά ψηφία
        System.out.printf("Θετικά:   %.6f%n", positiveFreq);
        System.out.printf("Αρνητικά: %.6f%n", negativeFreq);
        System.out.printf("Μηδενικά: %.6f%n", zeroFreq);
    }

}


