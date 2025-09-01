package gr.aueb.cf;

/*
Γράψτε μια μέθοδο που δέχεται δύο ακεραίους και επιστρέφει το άθροισμά τους
• Είσοδος:
• Αριθμοί: 4 και 9
• Έξοδος:
• 13 (δηλαδή το άθροισμα)
 */
public class SumOfTwo1 {


    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 7;

        int result = sum(num1, num2);

        System.out.println("Το άθροισμα είναι: " + result);

    }

    public static int sum(int a, int b) {
        return a + b;
    }


}
