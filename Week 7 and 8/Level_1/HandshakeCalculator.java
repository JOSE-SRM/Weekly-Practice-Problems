import java.util.Scanner;

public class HandshakeCalculator {
    public int calculateMaximumHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] arguments) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Enter Number of Students:");
        int numberOfStudents = inputScanner.nextInt();
        
        HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
        int maximumHandshakes = handshakeCalculator.calculateMaximumHandshakes(numberOfStudents);
        
        System.out.println("The maximum number of possible handshakes is: " + maximumHandshakes);
    }
}
