class CalculateAverage{
  public static void main(String[] args) {
    
    int mathsMark = 94, physicsMark = 95, chemistryMark = 96;

    int totalMarks = mathsMark + physicsMark + chemistryMark;
    int totalNumberOfSubjects = 3;

    double averagePercentMarks = (double)totalMarks/(double)totalNumberOfSubjects;

    System.out.println("Sam's Average Percent Marks in PCM is: " + averagePercentMarks);

  }
}
