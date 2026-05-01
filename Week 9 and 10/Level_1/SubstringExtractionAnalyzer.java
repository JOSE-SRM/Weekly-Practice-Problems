import java.util.Scanner;

public class SubstringExtractionAnalyzer {
    public String extractSubstringUsingCharacterIteration(String originalString, int startingIndex, int endingIndex) {
        String resultantSubstring = "";
        for (int characterIndex = startingIndex; characterIndex < endingIndex; characterIndex++) {
            resultantSubstring += originalString.charAt(characterIndex);
        }
        return resultantSubstring;
    }

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
            
            System.out.println("Enter string:");
            String originalString = inputScanner.next();
            
            System.out.println("Enter start index:");
            int startingIndex = inputScanner.nextInt();
            
            System.out.println("Enter end index:");
            int endingIndex = inputScanner.nextInt();

            SubstringExtractionAnalyzer extractionAnalyzer = new SubstringExtractionAnalyzer();
            String customSubstringResult = extractionAnalyzer.extractSubstringUsingCharacterIteration(originalString, startingIndex, endingIndex);
            String builtInSubstringResult = originalString.substring(startingIndex, endingIndex);

            boolean matchResult = extractionAnalyzer.compareStringsUsingCharacterIteration(customSubstringResult, builtInSubstringResult);

            System.out.println("Custom substring: " + customSubstringResult);
            System.out.println("Built-in substring: " + builtInSubstringResult);
            System.out.println("Do substrings match? " + matchResult);
            
        } catch (StringIndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Invalid indexes provided for the substring.");
        } catch (RuntimeException runtimeException) {
            System.out.println("An unexpected runtime error occurred.");
        }
    }
}
