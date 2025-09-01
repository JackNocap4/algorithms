package gr.aueb.cf;

/*
Δίνεται ένας τετραγωνικός πίνακας. Να υπολογιστεί η απόλυτη διαφορά μεταξύ των αθροισμάτων των διαγωνίων του.
Παράδειγμα:
{1, 2, 3},
{4, 5, 6},
{9, 8, 9}
• Κύρια Διαγώνιος (1, 5, 9): 1 + 5 + 9 = 15
• Δευτερεύουσα Διαγώνιος (3, 5, 9): 3 + 5 + 9 = 17
• Διαφορά: |15 - 17| = 2
 */

public class DiagonalDifference4 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Η Διαφορά Διαγωνίων είναι: " + diagonalDifference(matrix));

    }

    public static int diagonalDifference(int[][] matrix) {
        int primarySum = 0;
        int secondarySum= 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++){
            primarySum = matrix[i][i];
            secondarySum = matrix[i] [n - 1 -i];
        }

        return Math.abs(primarySum - secondarySum);
    }
}
