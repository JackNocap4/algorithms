package gr.aueb.cf.ex2;

import java.util.Arrays;/*
Δίνεται ένας πίνακας ακεραίων.
• Να υπολογιστεί το άθροισμα των στοιχείων του.
• Παράδειγμα
• Είσοδος: [3, 7, 1, 9]
• Αναμενόμενη Έξοδος:
• 20 (δηλαδή: 3 + 7 + 1 + 9)
 */
public class Ex2 {

    public static void main(String[] args) {

        int[] numbers = {3, 7, 1, 9};

        System.out.println("Πίνακας: " + Arrays.toString(numbers));

        int result = arraySum(numbers);

        System.out.println("Άθροισμα: " + result); // περιμένουμε 20
    }


    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
