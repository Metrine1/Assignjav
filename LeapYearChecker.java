// package: leapyear;

public class LeapYearChecker {

    public void checkLeapYear() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is NOT a leap year.");
        }
    }

    public static void main(String[] args) {
        LeapYearChecker leap = new LeapYearChecker();
        leap.checkLeapYear();
    }
}
