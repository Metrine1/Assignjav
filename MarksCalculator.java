import java.util.Scanner;

public class MarksCalculator {

    public static void getAndComputeMarks() {
        Scanner scanner = new Scanner(System.in);

        // Ask for marks
        System.out.print("Enter marks for Java Programming: ");
        double javaMarks = scanner.nextDouble();

        System.out.print("Enter marks for Networking: ");
        double networkingMarks = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();

        // Compute average
        double average = (javaMarks + networkingMarks + mathsMarks) / 3;

        // Output in the required format
        System.out.println("\nMarks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + average);
    }

    // Main method to run the program
    public static void main(String[] args) {
        getAndComputeMarks();
    }
}
