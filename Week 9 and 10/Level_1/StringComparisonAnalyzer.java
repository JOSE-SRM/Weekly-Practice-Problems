import java.util.Scanner;

public class StringComparisonAnalyzer {
    public boolean compareStringsUsingCharacterIteration(String firstInputString, String secondInputString) {
        if (firstInputString.length() != secondInputString.length()) {
            return false;
        }
        for (int characterIndex = 0; characterIndex < firstInputString.length(); characterIndex++) {
            if (firstInputString.charAt(characterIndex) != secondInputString.charAt(characterIndex)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] argumentsArray) {
        try {
            Scanner inputScanner = new Scanner(System.in);
            
            System.out.println("Enter first string:");
            String firstInputString = inputScanner.next();
            
            System.out.println("Enter second string:");
            String secondInputString = inputScanner.next();

            StringComparisonAnalyzer comparisonAnalyzer = new StringComparisonAnalyzer();
            boolean customComparisonResult = comparisonAnalyzer.compareStringsUsingCharacterIteration(firstInputString, secondInputString);
            boolean builtInComparisonResult = firstInputString.equals(secondInputString);

            System.out.println("Custom match result: " + customComparisonResult);
            System.out.println("Built-in match result: " + builtInComparisonResult);
        } catch (RuntimeException runtimeException) {
            System.out.println("An error occurred during execution: " + runtimeException.getMessage());
        }
    }
}
