public class ArrayOperations {

    public static void main(String[] args) throws java.io.IOException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int[] array = new int[15];

        // ---- a) Take 15 values and store in array ----
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // ---- a) Print the values stored in the array ----
        System.out.println("\nValues in the array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // ---- b) Ask user to enter a number and search it ----
        System.out.print("\nEnter a number to search in the array: ");
        int searchNumber = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < 15; i++) {
            if (array[i] == searchNumber) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in this array.");
        }

        // ---- c) Create new array with reverse order ----
        int[] reversedArray = new int[15];
        for (int i = 0; i < 15; i++) {
            reversedArray[i] = array[14 - i];
        }

        System.out.println("\nReversed array values:");
        for (int i = 0; i < 15; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();

        // ---- d) Get sum and product of all elements ----
        int sum = 0;
        long product = 1;
        for (int i = 0; i < 15; i++) {
            sum += array[i];
            product *= array[i];
        }

        System.out.println("\nSum of elements: " + sum);
        System.out.println("Product of elements: " + product);
    }
}
