import java.util.Scanner;

public class NaturalNumberSumCalculator {
    public int calculateSumUsingRecursion(int targetNumber) {
        if (targetNumber <= 1) {
            return targetNumber;
        }
        return targetNumber + calculateSumUsingRecursion(targetNumber - 1);
    }

    public int calculateSumUsingFormula(int targetNumber) {
        return (targetNumber * (targetNumber + 1)) / 2;
    }

    public static void main(String[] arguments) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Enter a Natural Number:");
        int targetNumber = inputScanner.nextInt();
        
        if (targetNumber > 0) {
            NaturalNumberSumCalculator sumCalculator = new NaturalNumberSumCalculator();
            
            int sumFromRecursion = sumCalculator.calculateSumUsingRecursion(targetNumber);
            int sumFromFormula = sumCalculator.calculateSumUsingFormula(targetNumber);
            
            System.out.println("Sum using recursion: " + sumFromRecursion);
            System.out.println("Sum using formula: " + sumFromFormula);
            
            if (sumFromRecursion == sumFromFormula) {
                System.out.println("Both computations are correct and match.");
            } else {
                System.out.println("Computations do not match.");
            }
        } else {
            System.out.println("The provided number is not a natural number.");
        }
    }
}
