import java.util.Scanner;

class DivisibilityByFive {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    System.out.print("Is the number " + number + " divisible by 5? ");
    if (number % 5 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    input.close();
  }
}
