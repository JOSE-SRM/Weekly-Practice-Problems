import java.util.Scanner;

public class LeapYearChecker {
    public boolean checkIfLeapYear(int inputYear) {
        return (inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0);
    }

    public static void main(String[] arguments) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Enter a Year:");
        int inputYear = inputScanner.nextInt();
        
        if (inputYear >= 1582) {
            LeapYearChecker yearChecker = new LeapYearChecker();
            boolean isLeapYear = yearChecker.checkIfLeapYear(inputYear);
            
            if (isLeapYear) {
                System.out.println("The Year is a Leap Year");
            } else {
                System.out.println("The Year is not a Leap Year");
            }
        } else {
            System.out.println("Please enter a year greater than or equal to 1582.");
        }
    }
}
