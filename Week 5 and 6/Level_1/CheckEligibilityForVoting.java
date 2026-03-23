import java.util.Scanner;

class CheckEligibilityForVoting {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] ages = new int[10];

    for(int i = 0; i < 10; i++){
      System.out.print("Enter the age of Student " + (i+1) + ": ");
      ages[i] = input.nextInt();
    }

    for(int i = 0; i < 10; i++){
      if (ages[i] < 18) {
        System.out.println("The student with age " + ages[i] + " cannot vote.");
      } else {
        System.out.println("The student with age " + ages[i] + " can vote.");
      }
    }
    input.close();
  }
}
