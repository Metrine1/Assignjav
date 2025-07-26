
//Project: methods_in_java
	// Package: java_methods
	// Class: Methods

	public class Methods {
	    
	    // Method to find largest and smallest of three numbers
	    public void findLargestSmallest() {
            int num1 = 69;
            int num2 = 80;
            int num3 = 60;
	        
	        System.out.rintln("Enter three numbers: ");
	        System.out.print("Enter first number: ");
	        num1 = scanner.nextInt();
	        System.out.print("Enter second number: ");
	        num2 = scanner.nextInt();
	        System.out.print("Enter third number: ");
	        num3 = scanner.nextInt();
	        
	        int largest, smallest;
	        
	        // Find largest number using if statements
	        if (num1 >= num2 && num1 >= num3) {
	            largest = num1;
	        } 
	        else if (num2 >= num1 && num2 >= num3) {
	            largest = num2;
	        } else {
	            largest = num3;
	        }
	        
	        // Find smallest number using if statements
	        if (num1 <= num2 && num1 <= num3) {
	            smallest = num1;
	        } else if (num2 <= num1 && num2 <= num3) {
	            smallest = num2;
	        } else {
	            smallest = num3;
	        }
	        
	        // Display results in required format
	        System.out.println("The smallest number: " + smallest);
	        System.out.println("The largest number: " + largest);
	        System.out.println(largest + " is your largest and " + smallest + " smallest number.");
	    }
	    
	    public static void main (String[] args) {
	        Methods methods = new Methods();
	        methods.findLargestSmallest();
	}
	}
