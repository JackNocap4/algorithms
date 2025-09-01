package gr.aueb.cf;

public class PrimeChecker11 {

    public static void main(String[] args) {
        int number = 11;

        System.out.println("Αριθμός: " + number);
        System.out.println("Είναι πρώτος; " + isPrime(number));

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

