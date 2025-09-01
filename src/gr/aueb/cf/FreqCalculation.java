package gr.aueb.cf;

/*
Δημιουργήστε μια σκάλα με # και κενά ( ), όπου: Το ύψος της σκάλας είναι ένας ακέραιος n.
• Κάθε σκαλί έχει τον ίδιο αριθμό # με τον αριθμό της γραμμής του (πρώτη γραμμή: 1 #, δεύτερη γραμμή: 2 #, κ.ο.κ.).
• Τα κενά ευθυγραμμίζονται στα δεξιά για να σχηματίσουν τη σκάλα.
• Παράδειγμα για n = 4:
#
##
###
####
 */
public class FreqCalculation {

    public static void main(String[] args) {
        System.out.println("=== Σκάλα μεγέθους 4 ===");
        printStaircase(4);
        System.out.println();

    }

    public static void printStaircase(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Το n πρέπει να είναι θετικός ακέραιος");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
