import java.util.Scanner;

public class StringLengthAnalyzer {
    public int calculateStringLengthHandlingException(String originalString) {
        int characterCount = 0;
        try {
            while (true) {
                originalString.charAt(characterCount);
                characterCount++;
            }
        } catch (StringIndexOutOfBoundsException indexOutOfBoundsException) {
            return characterCount;
        }
    }

    public static void main(String[] argumentsArray) {
        try {
            Scanner inputScanner = new Scanner(System.in);
            
            System.out.println("Enter string:");
            String originalString = inputScanner.next();

            StringLengthAnalyzer lengthAnalyzer = new StringLengthAnalyzer();
            int customLengthResult = lengthAnalyzer.calculateStringLengthHandlingException(originalString);
            int builtInLengthResult = originalString.length();

            System.out.println("Custom length calculation: " + customLengthResult);
            System.out.println("Built-in length calculation: " + builtInLengthResult);
        } catch (RuntimeException runtimeException) {
            System.out.println("An unexpected error occurred during length calculation.");
        }
    }
}
