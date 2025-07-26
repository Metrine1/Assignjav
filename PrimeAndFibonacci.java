public class PrimeAndFibonacci {

    // a. Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // a. Main method to display prime numbers between 1 and 500
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for spacing

        // Call method from part c
        int sum = sumEvenFibonacci(4000000);
        System.out.println("\nSum of even-valued Fibonacci terms not exceeding 4 million: " + sum);
    }

    // c. Method to sum even Fibonacci numbers not exceeding a limit
    public static int sumEvenFibonacci(int limit) {
        int a = 1, b = 2;
        int sum = 0;

        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }
}
