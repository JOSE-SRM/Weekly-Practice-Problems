import java.util.Scanner;

public class UniqueCharacterAnalyzer {
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

    public char[] extractUniqueCharactersUsingIteration(String originalString) {
        int stringLength = calculateStringLengthHandlingException(originalString);
        char[] temporaryCharacterArray = new char[stringLength];
        int uniqueCharacterCount = 0;

        for (int outerCharacterIndex = 0; outerCharacterIndex < stringLength; outerCharacterIndex++) {
            char currentCharacter = originalString.charAt(outerCharacterIndex);
            boolean isCharacterAlreadyPresent = false;

            for (int innerCharacterIndex = 0; innerCharacterIndex < uniqueCharacterCount; innerCharacterIndex++) {
                if (temporaryCharacterArray[innerCharacterIndex] == currentCharacter) {
                    isCharacterAlreadyPresent = true;
                    break;
                }
            }

            if (!isCharacterAlreadyPresent) {
                temporaryCharacterArray[uniqueCharacterCount] = currentCharacter;
                uniqueCharacterCount++;
            }
        }

        char[] finalUniqueCharacterArray = new char[uniqueCharacterCount];
        for (int arrayIndex = 0; arrayIndex < uniqueCharacterCount; arrayIndex++) {
            finalUniqueCharacterArray[arrayIndex] = temporaryCharacterArray[arrayIndex];
        }

        return finalUniqueCharacterArray;
    }

    public static void main(String[] argumentsArray) {
        try {
            Scanner inputScanner = new Scanner(System.in);
            
            System.out.println("Enter string:");
            String originalString = inputScanner.next();

            UniqueCharacterAnalyzer uniqueAnalyzer = new UniqueCharacterAnalyzer();
            char[] uniqueCharactersResultArray = uniqueAnalyzer.extractUniqueCharactersUsingIteration(originalString);

            System.out.print("Unique characters: ");
            for (int arrayIndex = 0; arrayIndex < uniqueCharactersResultArray.length; arrayIndex++) {
                System.out.print(uniqueCharactersResultArray[arrayIndex] + " ");
            }
            System.out.println();
            
        } catch (RuntimeException runtimeException) {
            System.out.println("An unexpected error occurred looking for unique characters.");
        }
    }
}
