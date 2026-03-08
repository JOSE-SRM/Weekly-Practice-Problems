import java.util.Scanner;

class BonusSalary {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the salary: ");
    int salary = input.nextInt();
    System.out.print("Enter the number of years in service: ");
    int yearOfService = input.nextInt();

    if (yearOfService <= 5) {
      System.out.println("Not elligible for Bonus.");
    } else {
      System.out.println("Bonus: " + (salary * 0.05));
    }
    input.close();
  }
}
