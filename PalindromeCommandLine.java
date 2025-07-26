public class PalindromeCommandLine {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid whole number.");
        }
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return original == reversed;
    }
}
