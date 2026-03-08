import java.util.Scanner;

class IsFirstNumberSmallest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number1: ");
    int number1 = input.nextInt();
    System.out.print("Enter a number2: ");
    int number2 = input.nextInt();
    System.out.print("Enter a number3: ");
    int number3 = input.nextInt();

    System.out.print("Is the first number the smallest? ");
    if ((number1 < number2) && (number1 < number3)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    input.close();
  }
}
