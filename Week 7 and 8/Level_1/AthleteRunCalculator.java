import java.util.Scanner;

public class AthleteRunCalculator {
    public double calculateNumberOfRounds(double sideOne, double sideTwo, double sideThree) {
        double perimeterOfPark = sideOne + sideTwo + sideThree;
        double targetDistanceInMeters = 5000.0;
        return targetDistanceInMeters / perimeterOfPark;
    }

    public static void main(String[] arguments) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Enter First Side in Meters:");
        double sideOne = inputScanner.nextDouble();
        
        System.out.println("Enter Second Side in Meters:");
        double sideTwo = inputScanner.nextDouble();
        
        System.out.println("Enter Third Side in Meters:");
        double sideThree = inputScanner.nextDouble();
        
        AthleteRunCalculator runCalculator = new AthleteRunCalculator();
        double numberOfRounds = runCalculator.calculateNumberOfRounds(sideOne, sideTwo, sideThree);
        
        System.out.println("Rounds required to complete five kilometers: " + Math.ceil(numberOfRounds));
    }
}
