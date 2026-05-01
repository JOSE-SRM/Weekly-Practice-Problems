import java.util.Scanner;

public class CharacterArrayAnalyzer {
    public char[] extractCharacterArrayUsingIteration(String originalString) {
        char[] resultantCharacterArray = new char[originalString.length()];
        for (int characterIndex = 0; characterIndex < originalString.length(); characterIndex++) {
            resultantCharacterArray[characterIndex] = originalString.charAt(characterIndex);
        }
        return resultantCharacterArray;
    }

    public boolean compareCharacterArraysUsingIteration(char[] firstCharacterArray, char[] secondCharacterArray) {
        if (firstCharacterArray.length != secondCharacterArray.length) {
            return false;
        }
        for (int characterIndex = 0; characterIndex < firstCharacterArray.length; characterIndex++) {
            if (firstCharacterArray[characterIndex] != secondCharacterArray[characterIndex]) {
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

            CharacterArrayAnalyzer arrayAnalyzer = new CharacterArrayAnalyzer();
            char[] customCharacterArrayResult = arrayAnalyzer.extractCharacterArrayUsingIteration(originalString);
            char[] builtInCharacterArrayResult = originalString.toCharArray();

            boolean matchResult = arrayAnalyzer.compareCharacterArraysUsingIteration(customCharacterArrayResult, builtInCharacterArrayResult);

            System.out.println("Do character arrays match? " + matchResult);
        } catch (RuntimeException runtimeException) {
            System.out.println("An unexpected error occurred processing the arrays.");
        }
    }
}
