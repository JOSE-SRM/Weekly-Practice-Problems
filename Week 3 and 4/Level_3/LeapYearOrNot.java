import java.util.Scanner;

class LeapYearOrNot {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a year: ");
    int year = input.nextInt();

    System.out.print("Is the year " + year + ", leap year or not? ");
    if (year >= 1582) {
      if ((year % 4 == 0) && (!(year % 100 == 0) || (year % 400 == 0))) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    } else {
      System.out.println("No");
    }

    input.close();
  }
}
