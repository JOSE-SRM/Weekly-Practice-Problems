import java.util.Scanner;

public class StringSplitAnalyzer {
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

    public String[] splitStringIntoWordsUsingIteration(String originalString) {
        int stringLength = calculateStringLengthHandlingException(originalString);
        int spaceCount = 0;
        
        for (int characterIndex = 0; characterIndex < stringLength; characterIndex++) {
            if (originalString.charAt(characterIndex) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndicesArray = new int[spaceCount];
        int currentSpaceIndexPosition = 0;
        for (int characterIndex = 0; characterIndex < stringLength; characterIndex++) {
            if (originalString.charAt(characterIndex) == ' ') {
                spaceIndicesArray[currentSpaceIndexPosition] = characterIndex;
                currentSpaceIndexPosition++;
            }
        }

        String[] resultantWordArray = new String[spaceCount + 1];
        int startingWordIndex = 0;
        int currentWordArrayIndex = 0;

        for (int spaceIndexPointer = 0; spaceIndexPointer < spaceIndicesArray.length; spaceIndexPointer++) {
            String currentWord = "";
            for (int characterIndex = startingWordIndex; characterIndex < spaceIndicesArray[spaceIndexPointer]; characterIndex++) {
                currentWord += originalString.charAt(characterIndex);
            }
            resultantWordArray[currentWordArrayIndex] = currentWord;
            currentWordArrayIndex++;
            startingWordIndex = spaceIndicesArray[spaceIndexPointer] + 1;
        }

        String finalWord = "";
        for (int characterIndex = startingWordIndex; characterIndex < stringLength; characterIndex++) {
            finalWord += originalString.charAt(characterIndex);
        }
        resultantWordArray[currentWordArrayIndex] = finalWord;

        return resultantWordArray;
    }

    public boolean compareStringArraysUsingIteration(String[] firstStringArray, String[] secondStringArray) {
        if (firstStringArray.length != secondStringArray.length) {
            return false;
        }
        for (int arrayIndex = 0; arrayIndex < firstStringArray.length; arrayIndex++) {
            if (!firstStringArray[arrayIndex].equals(secondStringArray[arrayIndex])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] argumentsArray) {
        try {
            Scanner inputScanner = new Scanner(System.in);
            
            System.out.println("Enter text separated by spaces:");
            String originalString = inputScanner.nextLine();

            StringSplitAnalyzer splitAnalyzer = new StringSplitAnalyzer();
            String[] customSplitResultArray = splitAnalyzer.splitStringIntoWordsUsingIteration(originalString);
            String[] builtInSplitResultArray = originalString.split(" ");

            boolean matchResult = splitAnalyzer.compareStringArraysUsingIteration(customSplitResultArray, builtInSplitResultArray);

            System.out.println("Do split string arrays match? " + matchResult);
        } catch (RuntimeException runtimeException) {
            System.out.println("An unexpected error occurred handling text separation.");
        }
    }
}
