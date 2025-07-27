public class FibonacciEvenSum {

    public static void main(String[] args) {
        int limit = 4000000;
        printFibonacciAndSumEven(limit);
    }

    // Method to print Fibonacci sequence and sum even-valued terms up to given limit
    public static void printFibonacciAndSumEven(int max) {
        int a = 1;
        int b = 2;
        int sumEven = 0;

        System.out.println("Fibonacci sequence up to " + max + ":");

        while (a <= max) {
            System.out.print(a + " ");
            
            // Sum only even Fibonacci terms
            if (a % 2 == 0) {
                sumEven += a;
            }

            // Generate next Fibonacci number
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\n\nSum of even-valued terms: " + sumEven);
    }
}
