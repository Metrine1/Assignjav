import java.util.Scanner;

public class PrimeChecker {

    // Method that asks user to input a number and checks if it's prime
    public static boolean isPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Overloaded method to check if any integer is prime (used by main method)
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Part 1: Check if a user-entered number is prime
        boolean result = isPrime();
        if (result) {
            System.out.println("The entered number is a prime number.");
        } else {
            System.out.println("The entered number is not a prime number.");
        }

        // Part 2: Display all prime numbers between 1 and 500
        System.out.println("\nPrime numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
