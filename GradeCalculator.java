package university.grading;

public class GradeCalculator {

    public void calculateAndDisplayGrades(double javaMarks, double networkingMarks, double mathsMarks) {
        // Validate input marks (0-100)
        if (javaMarks < 0 || javaMarks > 100 ||
            networkingMarks < 0 || networkingMarks > 100 ||
            mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("Error: Marks must be between 0 and 100");
            return;
        }

        // Calculate average
        double average = (javaMarks + networkingMarks + mathsMarks) / 3;

        // Display results in required format
        System.out.println("\nResults:");
        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.printf("The average is: %.2f\n", average);
    }

    public static void main(String[] args) {
        // Ensure all 3 marks are provided as command-line arguments
        if (args.length != 3) {
            System.out.println("Please enter exactly 3 marks: Java Programming, Networking, and Maths.");
            System.out.println("Example: java university.grading.GradeCalculator 75 80 65");
            return;
        }

        try {
            // Parse command-line arguments to double
            double javaMarks = Double.parseDouble(args[0]);
            double networkingMarks = Double.parseDouble(args[1]);
            double mathsMarks = Double.parseDouble(args[2]);

            // Create object and call method
            GradeCalculator calculator = new GradeCalculator();
            calculator.calculateAndDisplayGrades(javaMarks, networkingMarks, mathsMarks);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values for marks.");
        }
    }
}
