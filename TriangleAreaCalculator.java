// File: src/shapes/TriangleAreaCalculator.java
//package shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleAreaCalculator {
    private double base;
    private double height;
    private double area;
    
    // Method to ask user to enter base and height of triangle
    public void getUserInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Triangle Area Calculator");
            System.out.println();
            
            // Get base from user
            System.out.print("Kindly enter the base Value: ");
            String baseInput = reader.readLine();
            this.base = Double.parseDouble(baseInput);
            
            // Validate base
            if (base <= 0) {
                System.out.println("Error: Base must be a positive number.");
                return;
            }
            
            // Get height from user
            System.out.print("Kindly enter the height value: ");
            String heightInput = reader.readLine();
            this.height = Double.parseDouble(heightInput);
            
            // Validate height
            if (height <= 0) {
                System.out.println("Error: Height must be a positive number.");
                return;
            }
            
            System.out.println();
            System.out.println("Input received successfully!");
            
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }
    }
    
    // Method to compute the area of the triangle
    public void computeTriangleArea() {
        if (base > 0 && height > 0) {
            this.area = 0.5 * base * height;
            System.out.println("Area calculation completed.");
        } else {
            System.out.println("Cannot calculate area: Invalid base or height values.");
        }
    }
    
    // Method to output and display the calculated area
    public void displayResult() {
        System.out.println();
        System.out.println("=== CALCULATION RESULTS ===");
        System.out.println("Triangle Base: " + base + " units");
        System.out.println("Triangle Height: " + height + " units");
        System.out.printf("Triangle Area: %.2f square units%n", area);
        System.out.println();
        System.out.println("Formula used: Area = 0.5 × base × height");
        System.out.printf("Calculation: Area = 0.5 × %.2f × %.2f = %.2f%n", base, height, area);
    }
    
    // Main method to run the program
    public static void main(String[] args) {
        System.out.println("Starting Triangle Area Calculator...");
        System.out.println();
        
        // Create an instance of the calculator
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        
        // Execute the three non-static methods in sequence
        calculator.getUserInput();       // Ask user for input
        calculator.computeTriangleArea(); // Calculate the area
        calculator.displayResult();      // Display the results
        
        System.out.println("Computation complete. Happy Automation!");
    }
}