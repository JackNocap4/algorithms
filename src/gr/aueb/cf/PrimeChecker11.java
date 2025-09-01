package gr.aueb.cf;

public class PrimeChecker11 {

    public static void main(String[] args) {
        int number = 17;

        System.out.println("Αριθμός: " + number);
        System.out.println("Είναι πρώτος; " + isPrime(number));

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
