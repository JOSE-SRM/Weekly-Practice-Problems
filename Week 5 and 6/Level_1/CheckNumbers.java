import java.util.Scanner;

class CheckNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] numbers = new int[5];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      numbers[i] = input.nextInt();
    }

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 0) {
        System.out.println("Number " + (i + 1) + " is Zero.");
      } else if (numbers[i] < 0) {
        System.out.println("Number " + (i + 1) + " is negative.");
      } else {
        System.out.println("Number " + (i + 1) + " is " + (numbers[i] % 2 == 0 ? "Even." : "Odd."));
      }
    }

    System.out.println("The first number is " + ((numbers[0] == numbers[4]) ? "equal to"
        : ((numbers[0] < numbers[4]) ? "lesser than" : "greater than")) + " last number");
    input.close();
  }
}
