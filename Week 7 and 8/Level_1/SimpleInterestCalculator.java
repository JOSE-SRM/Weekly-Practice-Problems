import java.util.Scanner;

public class SimpleInterestCalculator {
    public double calculateSimpleInterest(double principalAmount, double rateOfInterest, double timeInYears) {
        return (principalAmount * rateOfInterest * timeInYears) / 100.0;
    }

    public static void main(String[] arguments) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Enter Principal Amount:");
        double principalAmount = inputScanner.nextDouble();
        
        System.out.println("Enter Rate of Interest:");
        double rateOfInterest = inputScanner.nextDouble();
        
        System.out.println("Enter Time in Years:");
        double timeInYears = inputScanner.nextDouble();
        
        SimpleInterestCalculator interestCalculator = new SimpleInterestCalculator();
        double simpleInterest = interestCalculator.calculateSimpleInterest(principalAmount, rateOfInterest, timeInYears);
        
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principalAmount + ", Rate of Interest " + rateOfInterest + " and Time " + timeInYears);
    }
}
