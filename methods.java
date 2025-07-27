// File location: methods_in_java/java_methods/Methods.java
//package java_methods;

import java.util.Scanner;

public class Methods {

    public void findSmallestAndLargest() {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest = num1;
        int smallest = num1;

        // Determine largest
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Determine smallest
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Output
        System.out.println("\nThe smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " smallest number.");
    }

    // Main method to run the code
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.findSmallestAndLargest();
    }
}
