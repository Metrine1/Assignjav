public class MyProgram {
    
    // Constructor
    public MyProgram() {
        System.out.println("Constructor called: MyProgram object has been created.");
    }

    // Non-static method
    public void displayMessage() {
        System.out.println("This method is a non-static.");
    }

    // Static method 1
    public static void staticMethodOne() {
        System.out.println("Static Method One called.");
    }

    // Static method 2
    public static void staticMethodTwo() {
        System.out.println("Static Method Two called.");
    }

    // Main method (entry point)
    public static void main(String[] args) {
        // Call static methods directly
        staticMethodOne();
        staticMethodTwo();

        // Create an object to call non-static method
        MyProgram obj = new MyProgram();
        obj.displayMessage();
    }
}
